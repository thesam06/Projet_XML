xquery version "3.1";

declare namespace mi = "http://miage.fr/chamir";

declare function mi:pomme() as node() {
    let $x := (doc("/db/ProjetXML/amib.xml")/raweb/identification/projectName)
    return $x
};

declare function mi:toto() as node() {
	let $x := (doc("/db/ProjetXML/alice.xml")/raweb/identification/projectName)
	return $x
};



declare function mi:kiwi() as xs:string {
    let $x := request:get-parameter('z','mi:toto()')
    return util:eval($x)
};

mi:kiwi()
