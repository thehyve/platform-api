package inputs

import play.api.libs.json.{JsValue, Json, Reads}

trait DrugInputs {
  lazy val chemblIds: Seq[String] = Seq(
    "CHEMBL1231",
    "CHEMBL1160523",
    "CHEMBL1200819",
    "CHEMBL1582",
    "CHEMBL1675",
    "CHEMBL2106972",
    "CHEMBL2108081",
    "CHEMBL2219417",
    "CHEMBL236718",
    "CHEMBL365845",
    "CHEMBL1212979",
    "CHEMBL1232903",
    "CHEMBL1441059",
    "CHEMBL3039531",
    "CHEMBL3249110",
    "CHEMBL500779",
    "CHEMBL1241348",
    "CHEMBL136478",
    "CHEMBL63055",
    "CHEMBL1161949",
    "CHEMBL1231535",
    "CHEMBL1231666",
    "CHEMBL1232699",
    "CHEMBL153813",
    "CHEMBL2107378",
    "CHEMBL489586",
    "CHEMBL101740",
    "CHEMBL328875",
    "CHEMBL490867",
    "CHEMBL73962",
    "CHEMBL3545082",
    "CHEMBL479960",
    "CHEMBL1200656",
    "CHEMBL139367",
    "CHEMBL142652",
    "CHEMBL195660",
    "CHEMBL229430",
    "CHEMBL457047",
    "CHEMBL1096339",
    "CHEMBL1201023",
    "CHEMBL1460",
    "CHEMBL1645462",
    "CHEMBL2106316",
    "CHEMBL2110767",
    "CHEMBL211614",
    "CHEMBL252164",
    "CHEMBL404508",
    "CHEMBL4298013",
    "CHEMBL101309",
    "CHEMBL1200485",
    "CHEMBL1201035",
    "CHEMBL1432",
    "CHEMBL194859",
    "CHEMBL3545157",
    "CHEMBL3786673",
    "CHEMBL4297524",
    "CHEMBL83088",
    "CHEMBL1728",
    "CHEMBL3306853",
    "CHEMBL3833348",
    "CHEMBL1618340",
    "CHEMBL2109477",
    "CHEMBL262777",
    "CHEMBL4069597",
    "CHEMBL169901",
    "CHEMBL1200453",
    "CHEMBL2095207",
    "CHEMBL2106780",
    "CHEMBL2251610",
    "CHEMBL570680",
    "CHEMBL132186",
    "CHEMBL1884833",
    "CHEMBL239243",
    "CHEMBL3235620",
    "CHEMBL4297797",
    "CHEMBL1201161",
    "CHEMBL1235351",
    "CHEMBL1480987",
    "CHEMBL1628504",
    "CHEMBL447183",
    "CHEMBL562668",
    "CHEMBL66380",
    "CHEMBL2105160",
    "CHEMBL2109649",
    "CHEMBL3184437",
    "CHEMBL380394",
    "CHEMBL1200983",
    "CHEMBL1230787",
    "CHEMBL2146883",
    "CHEMBL254951",
    "CHEMBL4208954",
    "CHEMBL504111",
    "CHEMBL113948",
    "CHEMBL2104095",
    "CHEMBL323348",
    "CHEMBL1201042",
    "CHEMBL1231",
    "CHEMBL1743017",
    "CHEMBL1949708",
    "CHEMBL350239",
    "CHEMBL480411",
    "CHEMBL489157",
    "CHEMBL521851",
    "CHEMBL959",
    "CHEMBL111861",
    "CHEMBL1495",
    "CHEMBL187718",
    "CHEMBL2109360",
    "CHEMBL2220384",
    "CHEMBL28472",
    "CHEMBL3545144",
    "CHEMBL510539",
    "CHEMBL1236433",
    "CHEMBL146755",
    "CHEMBL1951071",
    "CHEMBL2151197",
    "CHEMBL401843",
    "CHEMBL505147",
    "CHEMBL1079935",
    "CHEMBL1200449",
    "CHEMBL1229651",
    "CHEMBL2104153",
    "CHEMBL3301618",
    "CHEMBL1618378",
    "CHEMBL1709",
    "CHEMBL230347",
    "CHEMBL537",
    "CHEMBL92567",
    "CHEMBL1200933",
    "CHEMBL15571",
    "CHEMBL2408045",
    "CHEMBL279865",
    "CHEMBL454801",
    "CHEMBL48046",
    "CHEMBL1201640",
    "CHEMBL1231689",
    "CHEMBL1481873",
    "CHEMBL3545072",
    "CHEMBL372764",
    "CHEMBL4297605",
    "CHEMBL4297903",
    "CHEMBL1231661",
    "CHEMBL1556",
    "CHEMBL3544930",
    "CHEMBL551813",
    "CHEMBL1200617",
    "CHEMBL1512",
    "CHEMBL2109385",
    "CHEMBL239857",
    "CHEMBL1581",
    "CHEMBL2108669",
    "CHEMBL2109413",
    "CHEMBL2369989",
    "CHEMBL3039522",
    "CHEMBL3545125",
    "CHEMBL58910",
    "CHEMBL1198191",
    "CHEMBL1651026",
    "CHEMBL2103901",
    "CHEMBL2109544",
    "CHEMBL3301605",
    "CHEMBL4298177",
    "CHEMBL430",
    "CHEMBL436774",
    "CHEMBL82202",
    "CHEMBL1201614",
    "CHEMBL2105745",
    "CHEMBL2108475",
    "CHEMBL3545209",
    "CHEMBL1236189",
    "CHEMBL163",
    "CHEMBL233970",
    "CHEMBL3989691",
    "CHEMBL431",
    "CHEMBL1084081",
    "CHEMBL1201448",
    "CHEMBL1201656",
    "CHEMBL1734",
    "CHEMBL2141296",
    "CHEMBL2179105",
    "CHEMBL493287",
    "CHEMBL1232920",
    "CHEMBL1373254",
    "CHEMBL194176",
    "CHEMBL2107583",
    "CHEMBL1234200",
    "CHEMBL1323",
    "CHEMBL1963684",
    "CHEMBL2365665",
    "CHEMBL4297943",
    "CHEMBL172155",
    "CHEMBL187927",
    "CHEMBL226403",
    "CHEMBL416230",
    "CHEMBL4297397",
    "CHEMBL4297637",
    "CHEMBL490866",
    "CHEMBL64391",
    "CHEMBL1185242",
    "CHEMBL2105894",
    "CHEMBL403328",
    "CHEMBL4297596",
    "CHEMBL1201622",
    "CHEMBL1412041",
    "CHEMBL1697733",
    "CHEMBL276520",
    "CHEMBL3545372",
    "CHEMBL3989936",
    "CHEMBL404155",
    "CHEMBL417844",
    "CHEMBL4297848",
    "CHEMBL3182320",
    "CHEMBL592",
    "CHEMBL70971",
    "CHEMBL401842",
    "CHEMBL46439",
    "CHEMBL562743",
    "CHEMBL1134",
    "CHEMBL115",
    "CHEMBL1201338",
    "CHEMBL2109500",
    "CHEMBL284483",
    "CHEMBL3707311",
    "CHEMBL508461",
    "CHEMBL607710",
    "CHEMBL101801",
    "CHEMBL1088752",
    "CHEMBL1230674",
    "CHEMBL1234599",
    "CHEMBL204656",
    "CHEMBL2108078",
    "CHEMBL2108509",
    "CHEMBL3634131",
    "CHEMBL462018",
    "CHEMBL77484",
    "CHEMBL1737",
    "CHEMBL2108038",
    "CHEMBL2151591",
    "CHEMBL2359966",
    "CHEMBL3039520",
    "CHEMBL4297841",
    "CHEMBL4298016",
    "CHEMBL561057",
    "CHEMBL1336",
    "CHEMBL167874",
    "CHEMBL2109341",
    "CHEMBL2109366",
    "CHEMBL2109595",
    "CHEMBL213618",
    "CHEMBL307429",
    "CHEMBL3137320",
    "CHEMBL364713",
    "CHEMBL4283683",
    "CHEMBL2109571",
    "CHEMBL4297755",
    "CHEMBL4297900",
    "CHEMBL628",
    "CHEMBL1097279",
    "CHEMBL1201595",
    "CHEMBL142464",
    "CHEMBL1611",
    "CHEMBL1655",
    "CHEMBL2109553",
    "CHEMBL3989406",
    "CHEMBL445236",
    "CHEMBL53950",
    "CHEMBL118",
    "CHEMBL1201611",
    "CHEMBL185097",
    "CHEMBL3113974",
    "CHEMBL379692",
    "CHEMBL4297944",
    "CHEMBL43068",
    "CHEMBL456929",
    "CHEMBL1002",
    "CHEMBL1200661",
    "CHEMBL2063705",
    "CHEMBL2216870",
    "CHEMBL4297375",
    "CHEMBL1200459",
    "CHEMBL218289",
    "CHEMBL291386",
    "CHEMBL306043",
    "CHEMBL3317856",
    "CHEMBL443052",
    "CHEMBL457",
    "CHEMBL1185001",
    "CHEMBL2111144",
    "CHEMBL521078",
    "CHEMBL186179",
    "CHEMBL1910856",
    "CHEMBL191632",
    "CHEMBL2107324",
    "CHEMBL4297994",
    "CHEMBL1189150",
    "CHEMBL1743009",
    "CHEMBL1743057",
    "CHEMBL379845",
    "CHEMBL3989567",
    "CHEMBL550795",
    "CHEMBL1230122",
    "CHEMBL2062276",
    "CHEMBL3545284",
    "CHEMBL378160",
    "CHEMBL555205",
    "CHEMBL71263",
    "CHEMBL77517",
    "CHEMBL1201153",
    "CHEMBL1256137",
    "CHEMBL1742999",
    "CHEMBL24828",
    "CHEMBL304383",
    "CHEMBL34076",
    "CHEMBL556",
    "CHEMBL1096896",
    "CHEMBL1201190",
    "CHEMBL1201469",
    "CHEMBL362592",
    "CHEMBL4297495",
    "CHEMBL4297790",
    "CHEMBL470670",
    "CHEMBL92915",
    "CHEMBL1467",
    "CHEMBL2109644",
    "CHEMBL253896",
    "CHEMBL3707331",
    "CHEMBL4297922",
    "CHEMBL674",
    "CHEMBL1423",
    "CHEMBL16081",
    "CHEMBL1823817",
    "CHEMBL2110563",
    "CHEMBL265502",
    "CHEMBL313113",
    "CHEMBL316966",
    "CHEMBL3544913",
    "CHEMBL4298024",
    "CHEMBL1200623",
    "CHEMBL1405",
    "CHEMBL17423",
    "CHEMBL2108893",
    "CHEMBL1200543",
    "CHEMBL1201096",
    "CHEMBL1234293",
    "CHEMBL1616951",
    "CHEMBL3182813",
    "CHEMBL4297337",
    "CHEMBL588",
    "CHEMBL92404",
    "CHEMBL2105656",
    "CHEMBL29404",
    "CHEMBL3833317",
    "CHEMBL1094304",
    "CHEMBL1201479",
    "CHEMBL1215661",
    "CHEMBL2028852",
    "CHEMBL2108684",
    "CHEMBL351769",
    "CHEMBL3545001",
    "CHEMBL4297107",
    "CHEMBL82411",
    "CHEMBL1200928",
    "CHEMBL2104283",
    "CHEMBL2109641",
    "CHEMBL2138684",
    "CHEMBL25894",
    "CHEMBL45627",
    "CHEMBL54976",
    "CHEMBL1697708",
    "CHEMBL1957287",
    "CHEMBL2109546",
    "CHEMBL261720",
    "CHEMBL261932",
    "CHEMBL3544955",
    "CHEMBL3545000",
    "CHEMBL3989506",
    "CHEMBL4297784",
    "CHEMBL885",
    "CHEMBL1201572",
    "CHEMBL126224",
    "CHEMBL186720",
    "CHEMBL1951706",
    "CHEMBL3545424",
    "CHEMBL4298061",
    "CHEMBL472193",
    "CHEMBL240725",
    "CHEMBL362558",
    "CHEMBL1200762",
    "CHEMBL1201866",
    "CHEMBL2109457",
    "CHEMBL406734",
    "CHEMBL119296",
    "CHEMBL1200903",
    "CHEMBL1207907",
    "CHEMBL1232411",
    "CHEMBL1232777",
    "CHEMBL264373",
    "CHEMBL3545094",
    "CHEMBL39",
    "CHEMBL4297278",
    "CHEMBL4297577",
    "CHEMBL1256717",
    "CHEMBL2108881",
    "CHEMBL238103",
    "CHEMBL32",
    "CHEMBL1200750",
    "CHEMBL1208",
    "CHEMBL129482",
    "CHEMBL1441",
    "CHEMBL2104149",
    "CHEMBL2104489",
    "CHEMBL2109460",
    "CHEMBL32838",
    "CHEMBL4297876",
    "CHEMBL559",
    "CHEMBL855",
    "CHEMBL93836",
    "CHEMBL1003",
    "CHEMBL129529",
    "CHEMBL446061",
    "CHEMBL2103828",
    "CHEMBL3261331",
    "CHEMBL3400972",
    "CHEMBL515606",
    "CHEMBL7390",
    "CHEMBL915",
    "CHEMBL1148",
    "CHEMBL1201488",
    "CHEMBL1418176",
    "CHEMBL1671",
    "CHEMBL315838",
    "CHEMBL3833320",
    "CHEMBL1187319",
    "CHEMBL1200724",
    "CHEMBL1410743",
    "CHEMBL2110805",
    "CHEMBL3039113",
    "CHEMBL55643",
    "CHEMBL76029",
    "CHEMBL1083385",
    "CHEMBL1204498",
    "CHEMBL4297809",
    "CHEMBL44354",
    "CHEMBL1729803",
    "CHEMBL1743007",
    "CHEMBL3707281",
    "CHEMBL4297212",
    "CHEMBL1236872",
    "CHEMBL1368",
    "CHEMBL13766",
    "CHEMBL1697831",
    "CHEMBL4297611",
    "CHEMBL2109633",
    "CHEMBL214920",
    "CHEMBL276815",
    "CHEMBL3544947",
    "CHEMBL3707314",
    "CHEMBL1200807",
    "CHEMBL2003538",
    "CHEMBL2109423",
    "CHEMBL3301678",
    "CHEMBL4298136",
    "CHEMBL553025",
    "CHEMBL1617",
    "CHEMBL2105552",
    "CHEMBL2109421",
    "CHEMBL3833382",
    "CHEMBL406291",
    "CHEMBL444633",
    "CHEMBL931",
    "CHEMBL1197",
    "CHEMBL1200614",
    "CHEMBL1234696",
    "CHEMBL2107911",
    "CHEMBL3545360",
    "CHEMBL3707392",
    "CHEMBL375951",
    "CHEMBL3989885",
    "CHEMBL4297315",
    "CHEMBL4297442",
    "CHEMBL4297499",
    "CHEMBL938",
    "CHEMBL1201207",
    "CHEMBL1234905",
    "CHEMBL2062264",
    "CHEMBL3989971",
    "CHEMBL1098659",
    "CHEMBL1448",
    "CHEMBL1738797",
    "CHEMBL2108494",
    "CHEMBL2108508",
    "CHEMBL406050",
    "CHEMBL4297267",
    "CHEMBL70586",
    "CHEMBL1162",
    "CHEMBL1230795",
    "CHEMBL1233797",
    "CHEMBL1290",
    "CHEMBL16",
    "CHEMBL256997",
    "CHEMBL3707298",
    "CHEMBL4297208",
    "CHEMBL723",
    "CHEMBL96741",
    "CHEMBL1232392",
    "CHEMBL2109680",
    "CHEMBL113150",
    "CHEMBL1231700",
    "CHEMBL1456",
    "CHEMBL1534525",
    "CHEMBL3545235",
    "CHEMBL1201441",
    "CHEMBL1568276",
    "CHEMBL1910936",
    "CHEMBL2104116",
    "CHEMBL2105456",
    "CHEMBL211538",
    "CHEMBL47405",
    "CHEMBL1193948",
    "CHEMBL1201290",
    "CHEMBL1284",
    "CHEMBL177",
    "CHEMBL200435",
    "CHEMBL257978",
    "CHEMBL26424",
    "CHEMBL3545126",
    "CHEMBL3707446",
    "CHEMBL37387",
    "CHEMBL444929",
    "CHEMBL1201761",
    "CHEMBL1213406",
    "CHEMBL282042",
    "CHEMBL450995",
    "CHEMBL2089125",
    "CHEMBL2104619",
    "CHEMBL3137352",
    "CHEMBL38380",
    "CHEMBL4297065",
    "CHEMBL509485",
    "CHEMBL1201836",
    "CHEMBL1231498",
    "CHEMBL126726",
    "CHEMBL275638",
    "CHEMBL312862",
    "CHEMBL94394",
    "CHEMBL1201719",
    "CHEMBL2103870",
    "CHEMBL3545174",
    "CHEMBL4298109",
    "CHEMBL429910",
    "CHEMBL560739",
    "CHEMBL1200804",
    "CHEMBL1568057",
    "CHEMBL2106991",
    "CHEMBL2355456",
    "CHEMBL280728",
    "CHEMBL4297213",
    "CHEMBL4297676",
    "CHEMBL4297821",
    "CHEMBL1200758",
    "CHEMBL185586",
    "CHEMBL3544943",
    "CHEMBL410968",
    "CHEMBL863",
    "CHEMBL1743033",
    "CHEMBL2104607",
    "CHEMBL2109420",
    "CHEMBL358040",
    "CHEMBL564",
    "CHEMBL1731",
    "CHEMBL253838",
    "CHEMBL26128",
    "CHEMBL153479",
    "CHEMBL2108027",
    "CHEMBL299175",
    "CHEMBL3186027",
    "CHEMBL4297307",
    "CHEMBL4297750",
    "CHEMBL468154",
    "CHEMBL592868",
    "CHEMBL1180074",
    "CHEMBL1400561",
    "CHEMBL2109330",
    "CHEMBL222419",
    "CHEMBL295619",
    "CHEMBL3544995",
    "CHEMBL3545300",
    "CHEMBL1200472",
    "CHEMBL1201109",
    "CHEMBL1236594",
    "CHEMBL1743011",
    "CHEMBL1823681",
    "CHEMBL2109073",
    "CHEMBL2364618",
    "CHEMBL3545321",
    "CHEMBL450656",
    "CHEMBL1231469",
    "CHEMBL2105845",
    "CHEMBL413",
    "CHEMBL480517",
    "CHEMBL1229525",
    "CHEMBL1233528",
    "CHEMBL286738",
    "CHEMBL3928407",
    "CHEMBL4297450",
    "CHEMBL519260",
    "CHEMBL15192",
    "CHEMBL4297988",
    "CHEMBL539423",
    "CHEMBL572",
    "CHEMBL1104",
    "CHEMBL1201071",
    "CHEMBL1207358",
    "CHEMBL2105613",
    "CHEMBL2109437",
    "CHEMBL323533",
    "CHEMBL3545331",
    "CHEMBL476937",
    "CHEMBL519160",
    "CHEMBL75680",
    "CHEMBL1471",
    "CHEMBL2021424",
    "CHEMBL2096647",
    "CHEMBL210952",
    "CHEMBL2111066",
    "CHEMBL3039517",
    "CHEMBL3915620",
    "CHEMBL455186",
    "CHEMBL473159",
    "CHEMBL84",
    "CHEMBL1201147",
    "CHEMBL1472989",
    "CHEMBL2227975",
    "CHEMBL3039524",
    "CHEMBL3707248",
    "CHEMBL382127",
    "CHEMBL4297387",
    "CHEMBL4297936",
    "CHEMBL99203",
    "CHEMBL1481",
    "CHEMBL1483877",
    "CHEMBL2104700",
    "CHEMBL264702",
    "CHEMBL340032",
    "CHEMBL4297353",
    "CHEMBL2108110",
    "CHEMBL2108287",
    "CHEMBL2109332",
    "CHEMBL147792",
    "CHEMBL505",
    "CHEMBL1213447",
    "CHEMBL364092",
    "CHEMBL3989918",
    "CHEMBL4297664",
    "CHEMBL4297680",
    "CHEMBL1200955",
    "CHEMBL120708",
    "CHEMBL1365675",
    "CHEMBL1402684",
    "CHEMBL1672635",
    "CHEMBL368347",
    "CHEMBL3833363",
    "CHEMBL4093031",
    "CHEMBL460831",
    "CHEMBL70352",
    "CHEMBL1233300",
    "CHEMBL14227",
    "CHEMBL2107830",
    "CHEMBL351706",
    "CHEMBL1743005",
    "CHEMBL3707399",
    "CHEMBL4298124",
    "CHEMBL1474889",
    "CHEMBL2105801",
    "CHEMBL24038",
    "CHEMBL4297633",
    "CHEMBL1201141",
    "CHEMBL31421",
    "CHEMBL1743001",
    "CHEMBL2103826",
    "CHEMBL2108670",
    "CHEMBL218291",
    "CHEMBL3301673",
    "CHEMBL3546271",
    "CHEMBL372396",
    "CHEMBL3989926",
    "CHEMBL567303",
    "CHEMBL1200961",
    "CHEMBL1201239",
    "CHEMBL2035874",
    "CHEMBL214393",
    "CHEMBL808",
    "CHEMBL1697753",
    "CHEMBL445472",
    "CHEMBL64195",
    "CHEMBL770",
    "CHEMBL829",
    "CHEMBL1330",
    "CHEMBL1738758",
    "CHEMBL2028987",
    "CHEMBL2108253",
    "CHEMBL3183117",
    "CHEMBL3301668",
    "CHEMBL3707354",
    "CHEMBL6318",
    "CHEMBL1201498",
    "CHEMBL1236251",
    "CHEMBL1601",
    "CHEMBL2104964",
    "CHEMBL267719",
    "CHEMBL3989715",
    "CHEMBL457665",
    "CHEMBL771",
    "CHEMBL94277",
    "CHEMBL2147777",
    "CHEMBL257975",
    "CHEMBL4298100",
    "CHEMBL1236282",
    "CHEMBL2109564",
    "CHEMBL2109646",
    "CHEMBL526688",
    "CHEMBL2109427",
    "CHEMBL2109484",
    "CHEMBL377312",
    "CHEMBL4297863",
    "CHEMBL95193",
    "CHEMBL1200446",
    "CHEMBL1788396",
    "CHEMBL180300",
    "CHEMBL2103772",
    "CHEMBL2109263",
    "CHEMBL3707396",
    "CHEMBL1201039",
    "CHEMBL1235902",
    "CHEMBL295467",
    "CHEMBL399530",
    "CHEMBL421",
    "CHEMBL4250860",
    "CHEMBL2105231",
    "CHEMBL356362",
    "CHEMBL3989911",
    "CHEMBL517",
    "CHEMBL1941138",
    "CHEMBL202311",
    "CHEMBL2107723",
    "CHEMBL267178",
    "CHEMBL101253",
    "CHEMBL1173532",
    "CHEMBL1200475",
    "CHEMBL1237",
    "CHEMBL2109592",
    "CHEMBL383189",
    "CHEMBL4297445",
    "CHEMBL1097999",
    "CHEMBL1232414",
    "CHEMBL19019",
    "CHEMBL2106411",
    "CHEMBL701",
    "CHEMBL1201198",
    "CHEMBL1290003",
    "CHEMBL3707280",
    "CHEMBL522387",
    "CHEMBL127516",
    "CHEMBL1554",
    "CHEMBL2103873",
    "CHEMBL27759",
    "CHEMBL111",
    "CHEMBL1184",
    "CHEMBL1567",
    "CHEMBL374361",
    "CHEMBL4297470",
    "CHEMBL523395",
    "CHEMBL1201317",
    "CHEMBL1401508",
    "CHEMBL1797128",
    "CHEMBL2105694",
    "CHEMBL2109529",
    "CHEMBL304552",
    "CHEMBL3549142",
    "CHEMBL465",
    "CHEMBL1200686",
    "CHEMBL1232858",
    "CHEMBL2105630",
    "CHEMBL3338194",
    "CHEMBL1774645",
    "CHEMBL2108293",
    "CHEMBL3545306",
    "CHEMBL376756",
    "CHEMBL582887",
    "CHEMBL977",
    "CHEMBL1200779",
    "CHEMBL1616046",
    "CHEMBL2105872",
    "CHEMBL2107786",
    "CHEMBL3545223",
    "CHEMBL1259059",
    "CHEMBL2109279",
    "CHEMBL2109351",
    "CHEMBL2347704",
    "CHEMBL32113",
    "CHEMBL41036",
    "CHEMBL1234416",
    "CHEMBL1420",
    "CHEMBL734",
    "CHEMBL12856",
    "CHEMBL1519",
    "CHEMBL185918",
    "CHEMBL256528",
    "CHEMBL273453",
    "CHEMBL4297329",
    "CHEMBL1232889",
    "CHEMBL1237135",
    "CHEMBL2107811",
    "CHEMBL2108796",
    "CHEMBL3039543",
    "CHEMBL325434",
    "CHEMBL1078535",
    "CHEMBL1742983",
    "CHEMBL2109463",
    "CHEMBL3301572",
    "CHEMBL33845",
    "CHEMBL35",
    "CHEMBL29024",
    "CHEMBL1236104",
    "CHEMBL1289110",
    "CHEMBL2104668",
    "CHEMBL2108232",
    "CHEMBL352764",
    "CHEMBL4297609",
    "CHEMBL46486",
    "CHEMBL600",
    "CHEMBL1221657",
    "CHEMBL124718",
    "CHEMBL2110780",
    "CHEMBL3544996",
    "CHEMBL3545032",
    "CHEMBL1201134",
    "CHEMBL1201668",
    "CHEMBL1951095",
    "CHEMBL2108817",
    "CHEMBL2109535",
    "CHEMBL3186993",
    "CHEMBL4208229",
    "CHEMBL1201202",
    "CHEMBL1229789",
    "CHEMBL1231806",
    "CHEMBL1241951",
    "CHEMBL13291",
    "CHEMBL1697744",
    "CHEMBL176602",
    "CHEMBL3545037",
    "CHEMBL118841",
    "CHEMBL1200514",
    "CHEMBL1742990",
    "CHEMBL2107951",
    "CHEMBL309499",
    "CHEMBL3182343",
    "CHEMBL427",
    "CHEMBL4297820",
    "CHEMBL560993",
    "CHEMBL1742987",
    "CHEMBL2108875",
    "CHEMBL2109357",
    "CHEMBL2181932",
    "CHEMBL3545240",
    "CHEMBL3545265",
    "CHEMBL4072756",
    "CHEMBL2040681",
    "CHEMBL222863",
    "CHEMBL226345",
    "CHEMBL2364611",
    "CHEMBL3707226",
    "CHEMBL4079239",
    "CHEMBL117",
    "CHEMBL1200709",
    "CHEMBL1222398",
    "CHEMBL134702",
    "CHEMBL1371937",
    "CHEMBL153192",
    "CHEMBL3183740",
    "CHEMBL406",
    "CHEMBL1200366",
    "CHEMBL1235533",
    "CHEMBL205437",
    "CHEMBL4297425",
    "CHEMBL594",
    "CHEMBL3348963",
    "CHEMBL350320",
    "CHEMBL414883",
    "CHEMBL44",
    "CHEMBL607712",
    "CHEMBL1076257",
    "CHEMBL1230244",
    "CHEMBL2109281",
    "CHEMBL2442750",
    "CHEMBL3833346",
    "CHEMBL4297768",
    "CHEMBL1213251",
    "CHEMBL1231778",
    "CHEMBL1472975",
    "CHEMBL1650595",
    "CHEMBL1743076",
    "CHEMBL2107396",
    "CHEMBL2107801",
    "CHEMBL2109047",
    "CHEMBL4297259",
    "CHEMBL4297661",
    "CHEMBL449",
    "CHEMBL453620",
    "CHEMBL209740",
    "CHEMBL2105187",
    "CHEMBL2106041",
    "CHEMBL2109377",
    "CHEMBL231068",
    "CHEMBL4297920",
    "CHEMBL58343",
    "CHEMBL91829",
    "CHEMBL1230227",
    "CHEMBL223873",
    "CHEMBL36",
    "CHEMBL4297955",
    "CHEMBL617",
    "CHEMBL1230309",
    "CHEMBL2106650",
    "CHEMBL3301578",
    "CHEMBL333410",
    "CHEMBL3989603",
    "CHEMBL482811",
    "CHEMBL143324",
    "CHEMBL1517",
    "CHEMBL1743016",
    "CHEMBL2107771",
    "CHEMBL33986",
    "CHEMBL4298105",
    "CHEMBL1236235",
    "CHEMBL1685",
    "CHEMBL1742466",
    "CHEMBL1201534",
    "CHEMBL1255840",
    "CHEMBL13828",
    "CHEMBL139423",
    "CHEMBL1614641",
    "CHEMBL1892201",
    "CHEMBL1996652",
    "CHEMBL2105322",
    "CHEMBL255066",
    "CHEMBL3989695",
    "CHEMBL70663",
    "CHEMBL1201222",
    "CHEMBL1233882",
    "CHEMBL1234086",
    "CHEMBL136737",
    "CHEMBL1697748",
    "CHEMBL2107874",
    "CHEMBL3833377",
    "CHEMBL471638",
    "CHEMBL87708",
    "CHEMBL1200706",
    "CHEMBL2221249",
    "CHEMBL566752",
    "CHEMBL219341",
    "CHEMBL3104237",
    "CHEMBL514432",
    "CHEMBL119423",
    "CHEMBL1207949",
    "CHEMBL1200814",
    "CHEMBL2107334",
    "CHEMBL2109526",
    "CHEMBL3989519",
    "CHEMBL3989970",
    "CHEMBL1201044",
    "CHEMBL1371",
    "CHEMBL1521495",
    "CHEMBL168083",
    "CHEMBL2022411",
    "CHEMBL2108147",
    "CHEMBL2109643",
    "CHEMBL218490",
    "CHEMBL301742",
    "CHEMBL3707295",
    "CHEMBL42423",
    "CHEMBL438303",
    "CHEMBL1201645",
    "CHEMBL1236475",
    "CHEMBL1981292",
    "CHEMBL2376648",
    "CHEMBL3187503",
    "CHEMBL3989762",
    "CHEMBL442218",
    "CHEMBL1663",
    "CHEMBL1743029",
    "CHEMBL220492",
    "CHEMBL29",
    "CHEMBL433",
    "CHEMBL8224",
    "CHEMBL1938870",
    "CHEMBL27784",
    "CHEMBL28636",
    "CHEMBL3338866",
    "CHEMBL3545134",
    "CHEMBL370805",
    "CHEMBL85398",
    "CHEMBL1093458",
    "CHEMBL157548",
    "CHEMBL20945",
    "CHEMBL2109487",
    "CHEMBL3545285",
    "CHEMBL517712",
    "CHEMBL719",
    "CHEMBL2107354",
    "CHEMBL289288",
    "CHEMBL3707309",
    "CHEMBL4297415",
    "CHEMBL518800",
    "CHEMBL887",
    "CHEMBL190",
    "CHEMBL2108790",
    "CHEMBL2109143",
    "CHEMBL3989697",
    "CHEMBL4297656",
    "CHEMBL1852688",
    "CHEMBL2110670",
    "CHEMBL240530",
    "CHEMBL4297909",
    "CHEMBL4298026",
    "CHEMBL592054",
    "CHEMBL1201152",
    "CHEMBL1650443",
    "CHEMBL253359",
    "CHEMBL3186422",
    "CHEMBL508583",
    "CHEMBL1232767",
    "CHEMBL1235535",
    "CHEMBL1743027",
    "CHEMBL1897738",
    "CHEMBL2107214",
    "CHEMBL372795",
    "CHEMBL4297147",
    "CHEMBL563377",
    "CHEMBL1200851",
    "CHEMBL1235432",
    "CHEMBL1235722",
    "CHEMBL154111",
    "CHEMBL2106829",
    "CHEMBL408500",
    "CHEMBL4297749",
    "CHEMBL178938",
    "CHEMBL2108679",
    "CHEMBL2219642",
    "CHEMBL285123",
    "CHEMBL3545190",
    "CHEMBL44793",
    "CHEMBL491841",
    "CHEMBL2356097",
    "CHEMBL374107",
    "CHEMBL1076347",
    "CHEMBL1231347",
    "CHEMBL1254766",
    "CHEMBL15562",
    "CHEMBL2105131",
    "CHEMBL2106167",
    "CHEMBL3544939",
    "CHEMBL3545122",
    "CHEMBL707",
    "CHEMBL1095280",
    "CHEMBL1200721",
    "CHEMBL1256696",
    "CHEMBL1499",
    "CHEMBL2",
    "CHEMBL2107448",
    "CHEMBL2354773",
    "CHEMBL264950",
    "CHEMBL4297956",
    "CHEMBL1200845",
    "CHEMBL1201648",
    "CHEMBL121663",
    "CHEMBL2079587",
    "CHEMBL2107772",
    "CHEMBL3301670",
    "CHEMBL3707370",
    "CHEMBL593429",
    "CHEMBL1276010",
    "CHEMBL2107380",
    "CHEMBL379000",
    "CHEMBL3989496",
    "CHEMBL3544537",
    "CHEMBL3950712",
    "CHEMBL3971095",
    "CHEMBL525194",
    "CHEMBL100622",
    "CHEMBL1201059",
    "CHEMBL2062257",
    "CHEMBL251634",
    "CHEMBL306226",
    "CHEMBL47386",
    "CHEMBL522157",
    "CHEMBL1200351",
    "CHEMBL2106825",
    "CHEMBL376632",
    "CHEMBL657",
    "CHEMBL1200935",
    "CHEMBL2110912",
    "CHEMBL550453",
    "CHEMBL1951143",
    "CHEMBL4297461",
    "CHEMBL572528",
    "CHEMBL2107455",
    "CHEMBL383570",
    "CHEMBL1076637",
    "CHEMBL1080983",
    "CHEMBL1169490",
    "CHEMBL1201387",
    "CHEMBL1599",
    "CHEMBL2109558",
    "CHEMBL2110809",
    "CHEMBL3545370",
    "CHEMBL606260",
    "CHEMBL1200991",
    "CHEMBL143305",
    "CHEMBL2104744",
    "CHEMBL25164",
    "CHEMBL286497",
    "CHEMBL337450",
    "CHEMBL573306",
    "CHEMBL166863",
    "CHEMBL2108403",
    "CHEMBL494089",
    "CHEMBL1084546",
    "CHEMBL197194",
    "CHEMBL2105637",
    "CHEMBL2108034",
    "CHEMBL3545043",
    "CHEMBL42208",
    "CHEMBL1901620",
    "CHEMBL2028661",
    "CHEMBL352418",
    "CHEMBL3545225",
    "CHEMBL4297187",
    "CHEMBL4297287",
    "CHEMBL1697782",
    "CHEMBL2105618",
    "CHEMBL242080",
    "CHEMBL251429",
    "CHEMBL3545143",
    "CHEMBL3989887",
    "CHEMBL1567463",
    "CHEMBL1877495",
    "CHEMBL280074",
    "CHEMBL4297303",
    "CHEMBL4297561",
    "CHEMBL458616",
    "CHEMBL119",
    "CHEMBL1235140",
    "CHEMBL1482",
    "CHEMBL2106246",
    "CHEMBL302795",
    "CHEMBL4297271",
    "CHEMBL4297471",
    "CHEMBL476323",
    "CHEMBL132966",
    "CHEMBL144527",
    "CHEMBL2103815",
    "CHEMBL2109621",
    "CHEMBL3707402",
    "CHEMBL3833301",
    "CHEMBL64894",
    "CHEMBL2109363",
    "CHEMBL4297380",
    "CHEMBL889",
    "CHEMBL95700"
  )

  def idQuery(id: String): JsValue = Json.parse(
    s"""{ "query": "query { drug(chemblId: \\"$id\\") { id } }"}"""
  )
  def fullQuery(id: String): JsValue = Json.parse(
    s"""{"query": "query { drug(chemblId: \\"$id\\") { """
      + """id name synonyms tradeNames yearOfFirstApproval drugType maximumClinicalTrialPhase hasBeenWithdrawn """
      + """withdrawnNotice { classes countries reasons year } blackBoxWarning description isApproved approvedIndications """
      + """mechanismsOfAction { rows { mechanismOfAction actionType targetName references { ids source urls } targets { id } } uniqueActionTypes uniqueTargetTypes }"""
      + """indications { count rows { maxPhaseForIndication references { ids source } disease { id name description } } }"""
      + """linkedTargets {count rows { id approvedSymbol approvedName } }"""
      + """linkedDiseases {count rows { id name description } }"""
      + """crossReferences { source reference }"""
      + """} }" }"""
  )

  def parentChildMoAQuery(parent: String, child: String): JsValue = Json.parse(
    s"""{"query": "query { drugs(chemblIds: [\\"$parent\\", \\"$child\\"]) { name mechanismsOfAction { uniqueActionTypes uniqueTargetTypes rows { targetName targets {id} } } indications { count rows { disease { id } } } } }" }"""
  )
  def parentChildLinkedTargetQuery(parent: String, child: String): JsValue = Json.parse(
    s"""{"query": "query { drugs(chemblIds: [\\"$parent\\", \\"$child\\"]) { name linkedTargets { count rows { approvedSymbol } } } }" }"""
  )
  case class IDS(id: String)
  case class MOAR(targetName: String, targets: Array[IDS])
  case class MOA(uniqueActionTypes: Array[String],
                 uniqueTargetTypes: Array[String],
                 rows: Array[MOAR])
  case class IndRow(disease: IDS)
  case class IndicationT(count: Int, rows: Array[IndRow])
  case class LtRow(approvedSymbol: String)
  case class LinkedTargets(count: Int, rows: Array[LtRow])
  case class ParentChildMoAReturn(name: String,
                                  mechanismsOfAction: Option[MOA],
                                  indications: Option[IndicationT])
  case class ParentChildLinkedTargets(name: String, linkedTargets: Option[LinkedTargets])
  implicit val idsReads: Reads[IDS] = Json.reads[IDS]
  implicit val moarReads: Reads[MOAR] = Json.reads[MOAR]
  implicit val moaReads: Reads[MOA] = Json.reads[MOA]
  implicit val indRowReads: Reads[IndRow] = Json.reads[IndRow]
  implicit val indReads: Reads[IndicationT] = Json.reads[IndicationT]
  implicit val ltRowReads: Reads[LtRow] = Json.reads[LtRow]
  implicit val linkedTargetReads: Reads[LinkedTargets] = Json.reads[LinkedTargets]
  implicit val pcLinkedTargets: Reads[ParentChildLinkedTargets] =
    Json.reads[ParentChildLinkedTargets]
  implicit val trReads: Reads[ParentChildMoAReturn] = Json.reads[ParentChildMoAReturn]
}
