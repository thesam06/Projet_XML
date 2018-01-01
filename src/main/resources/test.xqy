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



declare function mi:appelerFonction() as xs:string {
    let $x := request:get-parameter('fn','mi:toto()')
    return xs:string(util:eval($x))
};

declare function mi:countallperson() as xs:integer{
  let $count := count(collection("/db/raweb")/raweb/team/person)
    return $count  
};

mi:appelerFonction()
