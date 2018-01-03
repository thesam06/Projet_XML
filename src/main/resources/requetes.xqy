xquery version "3.1";

declare namespace mi = "http://miage.fr/chamir";

declare function mi:pomme() as node() {
    let $x := (doc("/db/raweb/amib.xml")/raweb/identification/projectName)
    return $x
};

declare function mi:toto() as node() {
	let $x := (doc("/db/raweb/alice.xml")/raweb/identification/projectName)
	return $x
};



declare function mi:appelerFonction() as node()* {
    let $x := request:get-parameter('fn','mi:toto()')
    return util:eval($x)
};

declare function mi:countallperson() as xs:integer{
  let $count := count(collection("/db/raweb")/raweb/team/person)
    return $count  
};

(: Cette fonction renvoi tous les ids de centre de recherche :)
declare function mi:recuppererIDDeCentreDeRecherche()as node()*{
    let $res := for $x in doc("/db/raweb/bastriCris.xml")/crs/cr/@siid
        return <cr>{$x}</cr>
    return <crs>{$res}</crs>
    
};


(: Cette fonction renvoi tous les NOMS,  VILLE, DATEOUVERTURE, DATEFERMETURE:)
declare function mi:recuppererDetailsCentreDeRecherche()as node()*{
    let $res := for $cr in doc("/db/raweb/bastriCris.xml")/crs/cr
        return <cr>{$cr/@siid}<nom>{$cr/libelle}</nom><ville>{$cr/adressegeographique/ville}</ville>
            <do>{$cr/date_ouverture}</do><df>{$cr/date_fermeture}</df>
        </cr>
    return <crs>{$res}</crs>
    
};


mi:appelerFonction()


