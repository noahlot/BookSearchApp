/**
 * Filename: APITestDriver.java
 * Description: Program with main method to test the Search and Book classes with API data,
 *              and test parsing JSON data returned by the OpenLibrary Search API using GSON.
 * @author Noah Barajas
 * @date 2023-12-12
 */
 
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
 
 public class APITestDriver {
   public static void main(String[] args) {
      Gson gson = new Gson();
      String results = """
                       {
    "numFound": 38,
    "start": 0,
    "numFoundExact": true,
    "docs": [
        {
            "key": "/works/OL11822691W",
            "type": "work",
            "seed": [
                "/books/OL22695796M",
                "/books/OL27682742M",
                "/books/OL27682759M",
                "/books/OL27682760M",
                "/books/OL28441209M",
                "/books/OL24299609M",
                "/books/OL28759627M",
                "/books/OL26816144M",
                "/books/OL38793835M",
                "/books/OL28238830M",
                "/books/OL31902724M",
                "/books/OL31902725M",
                "/books/OL25629591M",
                "/books/OL32202507M",
                "/books/OL27899687M",
                "/books/OL27322181M",
                "/books/OL27191979M",
                "/books/OL25683677M",
                "/books/OL29811920M",
                "/works/OL11822691W",
                "/subjects/theater",
                "/subjects/juvenile_fiction",
                "/subjects/interpersonal_relations",
                "/subjects/fiction",
                "/subjects/homosexuality",
                "/subjects/dating_(social_customs)",
                "/subjects/overweight_persons",
                "/subjects/names_personal",
                "/subjects/personal_names",
                "/subjects/overweight_teenagers",
                "/subjects/musical_theater",
                "/subjects/gay_teenagers",
                "/subjects/obesity",
                "/subjects/musicales_(teatro)",
                "/subjects/hombres_gays",
                "/subjects/ficci\u00f3n_juvenil",
                "/subjects/nombres_personales",
                "/subjects/citas_amorosas",
                "/subjects/adolescentes",
                "/subjects/spanish_language_materials",
                "/subjects/ungdomar",
                "/subjects/musikaler",
                "/subjects/v\u00e4nskap",
                "/subjects/homosexualitet",
                "/subjects/k\u00e4rlek",
                "/subjects/slumpen",
                "/subjects/skolan",
                "/subjects/pojkar",
                "/subjects/olycklig_k\u00e4rlek",
                "/subjects/children's_fiction",
                "/subjects/homosexuality_fiction",
                "/subjects/names_personal_fiction",
                "/subjects/dating_(social_customs)_fiction",
                "/subjects/chicago_(ill.)_fiction",
                "/subjects/theater_fiction",
                "/subjects/interpersonal_relations_fiction",
                "/subjects/lgbtq_young_adult",
                "/subjects/stonewall_book_awards",
                "/subjects/nyt:chapter-books=2010-04-25",
                "/subjects/new_york_times_bestseller",
                "/subjects/high_schools",
                "/subjects/juvenile_fiction",
                "/subjects/high_school_students",
                "/subjects/person:will_grayson",
                "/subjects/person:tiny_cooper",
                "/subjects/place:chicago_(ill.)",
                "/authors/OL5046634A",
                "/authors/OL1394624A"
            ],
            "title": "Will Grayson, Will Grayson",
            "title_sort": "Will Grayson, Will Grayson",
            "title_suggest": "Will Grayson, Will Grayson",
            "edition_count": 19,
            "edition_key": [
                "OL22695796M",
                "OL27682742M",
                "OL27682759M",
                "OL27682760M",
                "OL28441209M",
                "OL24299609M",
                "OL28759627M",
                "OL26816144M",
                "OL38793835M",
                "OL28238830M",
                "OL31902724M",
                "OL31902725M",
                "OL25629591M",
                "OL32202507M",
                "OL27899687M",
                "OL27322181M",
                "OL27191979M",
                "OL25683677M",
                "OL29811920M"
            ],
            "publish_date": [
                "2015",
                "2009",
                "2010",
                "Apr 05, 2011",
                "2014",
                "Apr 06, 2010",
                "Jun 11, 2012",
                "2019",
                "Sep 09, 2013",
                "Apr 13, 2015",
                "2012",
                "2011"
            ],
            "publish_year": [
                2015,
                2009,
                2013,
                2010,
                2014,
                2019,
                2012,
                2011
            ],
            "first_publish_year": 2009,
            "number_of_pages_median": 335,
            "lccn": [
                "2008048979"
            ],
            "publish_place": [
                "New York",
                "Wroc\u0142aw, Poland"
            ],
            "oclc": [
                "893451034",
                "277118356"
            ],
            "contributor": [
                "Sobregu\u00e9s, Noem\u00ed, translator",
                "Green, John, 1977-",
                "Levithan, David, author",
                "Levithan, David."
            ],
            "lcc": [
                "PZ-0007.00000000.G8233Wil 2011",
                "PZ-0007.00000000.G8233 Wil 2010",
                "PS-3607.00000000.R43293 W55 2010",
                "PZ-0007.00000000.G8233 Wil 2009",
                "PZ-0007.00000000.G8233Wil 2009"
            ],
            "ddc": [
                "[Fic]"
            ],
            "isbn": [
                "0141346116",
                "1101222794",
                "9788364481727",
                "8364481959",
                "9780525421580",
                "9780606153584",
                "9781921656231",
                "9781441842619",
                "1921656239",
                "0142418471",
                "0141346124",
                "6073133405",
                "9783570308851",
                "9788364481956",
                "0606153586",
                "9781101222997",
                "9780141346120",
                "9781101910702",
                "1101222999",
                "8415594488",
                "9781441842626",
                "9788415594482",
                "1441842616",
                "9786073133401",
                "1441842608",
                "9781441842602",
                "9780141346113",
                "9786053435310",
                "6053435317",
                "836448172X",
                "1101910704",
                "1441842624",
                "0525421580",
                "9780142418475",
                "9781101222799",
                "3570308855"
            ],
            "last_modified_i": 1684376482,
            "ebook_count_i": 5,
            "ebook_access": "printdisabled",
            "has_fulltext": true,
            "public_scan_b": false,
            "ia": [
                "willgraysonwillg00gree",
                "willgraysonwillg0000gree_c0k4",
                "willgraysonwillg0000gree_r1u4",
                "willgraysonwillg0000gree",
                "willgraysonwillg0000gree_j2q4"
            ],
            "ia_collection": [
                "bannedbooks",
                "delawarecountydistrictlibrary-ol",
                "goffstownlibrary-ol",
                "internetarchivebooks",
                "miltonpubliclibrary-ol",
                "openlibrary-d-ol",
                "printdisabled",
                "tulsacc-ol",
                "worthingtonlibraries-ol"
            ],
            "ia_collection_s": "bannedbooks;delawarecountydistrictlibrary-ol;goffstownlibrary-ol;internetarchivebooks;miltonpubliclibrary-ol;openlibrary-d-ol;printdisabled;tulsacc-ol;worthingtonlibraries-ol",
            "printdisabled_s": "OL22695796M;OL28759627M;OL28238830M;OL27899687M;OL27191979M",
            "ratings_average": 3.7272727,
            "ratings_sortable": 3.2299492,
            "ratings_count": 22,
            "ratings_count_1": 0,
            "ratings_count_2": 3,
            "ratings_count_3": 7,
            "ratings_count_4": 5,
            "ratings_count_5": 7,
            "readinglog_count": 184,
            "want_to_read_count": 145,
            "currently_reading_count": 6,
            "already_read_count": 33,
            "cover_edition_key": "OL22695796M",
            "cover_i": 12358776,
            "publisher": [
                "Dutton",
                "cbt",
                "imusti",
                "Text Publishing Company",
                "Brilliance Audio",
                "Penguin Books, Limited",
                "Pegasus",
                "Penguin Young Readers Group",
                "PENGUIN INDIA",
                "Penguin USA, Inc.",
                "Wydawnictwo Bukowy Las",
                "Bukowy Las",
                "Penguin Random House Grupo Editorial",
                "John green",
                "Turtleback Books",
                "Nube de tinta"
            ],
            "language": [
                "eng",
                "tur",
                "pol",
                "spa"
            ],
            "author_key": [
                "OL5046634A",
                "OL1394624A"
            ],
            "author_name": [
                "John Green",
                "David Levithan"
            ],
            "author_alternative_name": [
                "DAVID LEVITHAN",
                "GREEN  JOHN",
                "JOHN GREEN"
            ],
            "person": [
                "Will Grayson",
                "Tiny Cooper"
            ],
            "place": [
                "Chicago (Ill.)"
            ],
            "subject": [
                "Theater",
                "Juvenile Fiction",
                "Interpersonal relations",
                "Fiction",
                "Homosexuality",
                "Dating (Social customs)",
                "Overweight persons",
                "Names, Personal",
                "Personal Names",
                "Overweight teenagers",
                "Musical theater",
                "Gay teenagers",
                "Obesity",
                "Musicales (Teatro)",
                "Hombres gays",
                "Ficci\u00f3n juvenil",
                "Nombres personales",
                "Citas amorosas",
                "Adolescentes",
                "Spanish language materials",
                "Ungdomar",
                "Musikaler",
                "V\u00e4nskap",
                "Homosexualitet",
                "K\u00e4rlek",
                "Slumpen",
                "Skolan",
                "Pojkar",
                "Olycklig k\u00e4rlek",
                "Children's fiction",
                "Homosexuality, fiction",
                "Names, personal, fiction",
                "Dating (social customs), fiction",
                "Chicago (ill.), fiction",
                "Theater, fiction",
                "Interpersonal relations, fiction",
                "LGBTQ young adult",
                "Stonewall Book Awards",
                "nyt:chapter-books=2010-04-25",
                "New York Times bestseller",
                "High schools",
                "Juvenile fiction",
                "High school students"
            ],
            "id_amazon": [
                "1441842624",
                "1441842608",
                "1441842616"
            ],
            "id_goodreads": [
                "6567017"
            ],
            "id_librarything": [
                "8463786"
            ],
            "id_overdrive": [
                "258E2CA8-F986-4379-9568-FC3C1867A6AD"
            ],
            "ia_loaded_id": [
                "willgraysonwillg00gree"
            ],
            "ia_box_id": [
                "IA177701",
                "IA1814709",
                "IA40229808",
                "IA1829802",
                "IA40011921"
            ],
            "publisher_facet": [
                "Brilliance Audio",
                "Bukowy Las",
                "Dutton",
                "John green",
                "Nube de tinta",
                "PENGUIN INDIA",
                "Pegasus",
                "Penguin Books, Limited",
                "Penguin Random House Grupo Editorial",
                "Penguin USA, Inc.",
                "Penguin Young Readers Group",
                "Text Publishing Company",
                "Turtleback Books",
                "Wydawnictwo Bukowy Las",
                "cbt",
                "imusti"
            ],
            "person_key": [
                "tiny_cooper",
                "will_grayson"
            ],
            "place_key": [
                "chicago_(ill.)"
            ],
            "person_facet": [
                "Tiny Cooper",
                "Will Grayson"
            ],
            "subject_facet": [
                "Adolescentes",
                "Chicago (ill.), fiction",
                "Children's fiction",
                "Citas amorosas",
                "Dating (Social customs)",
                "Dating (social customs), fiction",
                "Ficci\u00f3n juvenil",
                "Fiction",
                "Gay teenagers",
                "High school students",
                "High schools",
                "Hombres gays",
                "Homosexualitet",
                "Homosexuality",
                "Homosexuality, fiction",
                "Interpersonal relations",
                "Interpersonal relations, fiction",
                "Juvenile Fiction",
                "Juvenile fiction",
                "K\u00e4rlek",
                "LGBTQ young adult",
                "Musical theater",
                "Musicales (Teatro)",
                "Musikaler",
                "Names, Personal",
                "Names, personal, fiction",
                "New York Times bestseller",
                "Nombres personales",
                "Obesity",
                "Olycklig k\u00e4rlek",
                "Overweight persons",
                "Overweight teenagers",
                "Personal Names",
                "Pojkar",
                "Skolan",
                "Slumpen",
                "Spanish language materials",
                "Stonewall Book Awards",
                "Theater",
                "Theater, fiction",
                "Ungdomar",
                "V\u00e4nskap",
                "nyt:chapter-books=2010-04-25"
            ],
            "_version_": 1778936685539622912,
            "place_facet": [
                "Chicago (Ill.)"
            ],
            "lcc_sort": "PS-3607.00000000.R43293 W55 2010",
            "author_facet": [
                "OL1394624A David Levithan",
                "OL5046634A John Green"
            ],
            "subject_key": [
                "adolescentes",
                "chicago_(ill.)_fiction",
                "children's_fiction",
                "citas_amorosas",
                "dating_(social_customs)",
                "dating_(social_customs)_fiction",
                "ficci\u00f3n_juvenil",
                "fiction",
                "gay_teenagers",
                "high_school_students",
                "high_schools",
                "hombres_gays",
                "homosexualitet",
                "homosexuality",
                "homosexuality_fiction",
                "interpersonal_relations",
                "interpersonal_relations_fiction",
                "juvenile_fiction",
                "k\u00e4rlek",
                "lgbtq_young_adult",
                "musical_theater",
                "musicales_(teatro)",
                "musikaler",
                "names_personal",
                "names_personal_fiction",
                "new_york_times_bestseller",
                "nombres_personales",
                "nytchapter-books2010-04-25",
                "obesity",
                "olycklig_k\u00e4rlek",
                "overweight_persons",
                "overweight_teenagers",
                "personal_names",
                "pojkar",
                "skolan",
                "slumpen",
                "spanish_language_materials",
                "stonewall_book_awards",
                "theater",
                "theater_fiction",
                "ungdomar",
                "v\u00e4nskap"
            ],
            "ddc_sort": "[Fic]"
        },
        {
            "key": "/works/OL30165839W",
            "type": "work",
            "seed": [
                "/books/OL41462827M",
                "/works/OL30165839W",
                "/authors/OL5046634A",
                "/authors/OL10845157A",
                "/authors/OL7340421A",
                "/authors/OL7325688A"
            ],
            "title": "Will Grayson, Will Grayson",
            "title_suggest": "Will Grayson, Will Grayson",
            "title_sort": "Will Grayson, Will Grayson",
            "edition_count": 1,
            "edition_key": [
                "OL41462827M"
            ],
            "isbn": [
                "1441860827",
                "9781441860828"
            ],
            "last_modified_i": 1683709989,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "publisher": [
                "Brilliance Audio Lib Edn"
            ],
            "author_key": [
                "OL5046634A",
                "OL10845157A",
                "OL7340421A",
                "OL7325688A"
            ],
            "author_name": [
                "John Green",
                "David Levithan",
                "MacLeod Andrews",
                "Nick Podehl"
            ],
            "author_alternative_name": [
                "JOHN GREEN",
                "GREEN  JOHN"
            ],
            "publisher_facet": [
                "Brilliance Audio Lib Edn"
            ],
            "_version_": 1767925496988827648,
            "author_facet": [
                "OL10845157A David Levithan",
                "OL5046634A John Green",
                "OL7325688A Nick Podehl",
                "OL7340421A MacLeod Andrews"
            ]
        },
        {
            "key": "/works/OL34867245W",
            "type": "work",
            "seed": [
                "/books/OL47222510M",
                "/books/OL47456624M",
                "/books/OL47456625M",
                "/works/OL34867245W",
                "/authors/OL5046634A"
            ],
            "title": "Will Grayson, Will Grayson",
            "title_suggest": "Will Grayson, Will Grayson",
            "title_sort": "Will Grayson, Will Grayson",
            "edition_count": 3,
            "edition_key": [
                "OL47222510M",
                "OL47456624M",
                "OL47456625M"
            ],
            "publish_date": [
                "Jul 08, 2021",
                "Mar 19, 2010"
            ],
            "publish_year": [
                2010,
                2021
            ],
            "first_publish_year": 2010,
            "number_of_pages_median": 336,
            "isbn": [
                "9047703278",
                "8466353437",
                "9789047703273",
                "9788466353434"
            ],
            "last_modified_i": 1683709981,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL47222510M",
            "cover_i": 13658431,
            "publisher": [
                "DEBOLSILLO"
            ],
            "author_key": [
                "OL5046634A"
            ],
            "author_name": [
                "John Green"
            ],
            "author_alternative_name": [
                "GREEN  JOHN",
                "JOHN GREEN"
            ],
            "publisher_facet": [
                "DEBOLSILLO"
            ],
            "_version_": 1767932982915497984,
            "author_facet": [
                "OL5046634A John Green"
            ]
        },
        {
            "key": "/works/OL26378528W",
            "type": "work",
            "seed": [
                "/books/OL35617935M",
                "/works/OL26378528W",
                "/authors/OL3366167A"
            ],
            "title": "Will Grayson Will Grayson",
            "title_suggest": "Will Grayson Will Grayson",
            "title_sort": "Will Grayson Will Grayson",
            "edition_count": 1,
            "edition_key": [
                "OL35617935M"
            ],
            "publish_date": [
                "Nov 02, 2014"
            ],
            "publish_year": [
                2014
            ],
            "first_publish_year": 2014,
            "number_of_pages_median": 336,
            "isbn": [
                "9789871997091",
                "9871997094"
            ],
            "last_modified_i": 1636133548,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "readinglog_count": 2,
            "want_to_read_count": 2,
            "currently_reading_count": 0,
            "already_read_count": 0,
            "cover_edition_key": "OL35617935M",
            "cover_i": 12325114,
            "publisher": [
                "NUBE DE TINTA"
            ],
            "author_key": [
                "OL3366167A"
            ],
            "author_name": [
                "GREEN"
            ],
            "publisher_facet": [
                "NUBE DE TINTA"
            ],
            "_version_": 1767919057714020352,
            "author_facet": [
                "OL3366167A GREEN"
            ]
        },
        {
            "key": "/works/OL33705905W",
            "type": "work",
            "seed": [
                "/books/OL45670677M",
                "/works/OL33705905W"
            ],
            "title": "Will Grayson, Will Grayson",
            "title_suggest": "Will Grayson, Will Grayson",
            "title_sort": "Will Grayson, Will Grayson",
            "edition_count": 1,
            "edition_key": [
                "OL45670677M"
            ],
            "publish_date": [
                "2011-01-01"
            ],
            "publish_year": [
                2011
            ],
            "first_publish_year": 2011,
            "isbn": [
                "144873858X",
                "9781448738588"
            ],
            "last_modified_i": 1673672642,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "publisher": [
                "Paw Prints 2011-03-22"
            ],
            "publisher_facet": [
                "Paw Prints 2011-03-22"
            ],
            "_version_": 1767931081342844929
        },
        {
            "key": "/works/OL32495003W",
            "type": "work",
            "seed": [
                "/books/OL44288067M",
                "/works/OL32495003W",
                "/authors/OL9639061A",
                "/authors/OL9639062A"
            ],
            "title": "Who Will Grayson Be?",
            "title_suggest": "Who Will Grayson Be?",
            "title_sort": "Who Will Grayson Be?",
            "edition_count": 1,
            "edition_key": [
                "OL44288067M"
            ],
            "publish_date": [
                "2021"
            ],
            "publish_year": [
                2021
            ],
            "first_publish_year": 2021,
            "isbn": [
                "9798599496236"
            ],
            "last_modified_i": 1671314474,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "publisher": [
                "Independently Published"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL9639061A",
                "OL9639062A"
            ],
            "author_name": [
                "Anastasiia Benzel",
                "Ela Krepska"
            ],
            "publisher_facet": [
                "Independently Published"
            ],
            "_version_": 1767929087753453568,
            "author_facet": [
                "OL9639061A Anastasiia Benzel",
                "OL9639062A Ela Krepska"
            ]
        },
        {
            "key": "/works/OL35950946W",
            "type": "work",
            "seed": [
                "/books/OL48529563M",
                "/works/OL35950946W",
                "/authors/OL9639061A",
                "/authors/OL9639062A"
            ],
            "title": "Who Will Grayson Be?",
            "title_suggest": "Who Will Grayson Be?",
            "title_sort": "Who Will Grayson Be?",
            "edition_count": 1,
            "edition_key": [
                "OL48529563M"
            ],
            "publish_date": [
                "2021"
            ],
            "publish_year": [
                2021
            ],
            "first_publish_year": 2021,
            "isbn": [
                "9798599496366"
            ],
            "last_modified_i": 1687058536,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "readinglog_count": 0,
            "want_to_read_count": 0,
            "currently_reading_count": 0,
            "already_read_count": 0,
            "publisher": [
                "Independently Published"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL9639061A",
                "OL9639062A"
            ],
            "author_name": [
                "Anastasiia Benzel",
                "Ela Krepska"
            ],
            "publisher_facet": [
                "Independently Published"
            ],
            "_version_": 1769217537441005568,
            "author_facet": [
                "OL9639061A Anastasiia Benzel",
                "OL9639062A Ela Krepska"
            ]
        },
        {
            "key": "/works/OL286343W",
            "type": "work",
            "seed": [
                "/books/OL21805320M",
                "/books/OL18921433M",
                "/books/OL9208329M",
                "/books/OL16790876M",
                "/books/OL20547948M",
                "/books/OL20482365M",
                "/books/OL13905680M",
                "/books/OL10615594M",
                "/books/OL18705861M",
                "/books/OL8105424M",
                "/books/OL8689653M",
                "/books/OL10854348M",
                "/books/OL11646631M",
                "/books/OL9614243M",
                "/books/OL8471064M",
                "/books/OL12238925M",
                "/books/OL8482957M",
                "/books/OL8491234M",
                "/books/OL9477577M",
                "/books/OL24297726M",
                "/books/OL8904395M",
                "/books/OL11678444M",
                "/books/OL9872251M",
                "/books/OL12557855M",
                "/books/OL12558053M",
                "/books/OL9736456M",
                "/books/OL9849622M",
                "/books/OL9326639M",
                "/books/OL37455653M",
                "/books/OL35463200M",
                "/books/OL35465967M",
                "/books/OL35467463M",
                "/books/OL35464645M",
                "/books/OL35458875M",
                "/books/OL28801941M",
                "/books/OL35460662M",
                "/books/OL35461676M",
                "/books/OL37455755M",
                "/books/OL35467138M",
                "/books/OL35457447M",
                "/books/OL35467233M",
                "/books/OL35460763M",
                "/books/OL34861365M",
                "/books/OL36793201M",
                "/books/OL27534487M",
                "/books/OL27824463M",
                "/books/OL36900998M",
                "/books/OL30273579M",
                "/books/OL37546159M",
                "/books/OL30213039M",
                "/books/OL39674271M",
                "/books/OL39430421M",
                "/books/OL36497240M",
                "/books/OL38434696M",
                "/books/OL37507060M",
                "/books/OL37044832M",
                "/books/OL36065067M",
                "/books/OL36082539M",
                "/books/OL36953938M",
                "/books/OL38554429M",
                "/books/OL36987438M",
                "/books/OL36444456M",
                "/books/OL36111798M",
                "/books/OL37524185M",
                "/books/OL38529626M",
                "/books/OL38118407M",
                "/books/OL36568628M",
                "/books/OL34135386M",
                "/books/OL38468055M",
                "/books/OL37004911M",
                "/books/OL38427235M",
                "/books/OL37526880M",
                "/books/OL36932503M",
                "/books/OL38172123M",
                "/books/OL38203459M",
                "/books/OL38490541M",
                "/books/OL38555218M",
                "/books/OL38508121M",
                "/books/OL34324573M",
                "/books/OL37643677M",
                "/books/OL38194222M",
                "/books/OL37706488M",
                "/books/OL34998747M",
                "/books/OL36876701M",
                "/books/OL38496286M",
                "/books/OL36501179M",
                "/books/OL36584978M",
                "/books/OL38428996M",
                "/books/OL36073298M",
                "/books/OL36157348M",
                "/books/OL36044334M",
                "/books/OL37523531M",
                "/books/OL37502760M",
                "/books/OL35003167M",
                "/books/OL36922658M",
                "/books/OL36597470M",
                "/books/OL38202639M",
                "/books/OL36577153M",
                "/books/OL36983505M",
                "/books/OL38202482M",
                "/books/OL38188143M",
                "/books/OL38172097M",
                "/books/OL36947604M",
                "/books/OL37708068M",
                "/books/OL34330950M",
                "/books/OL36892332M",
                "/books/OL36491809M",
                "/books/OL35029244M",
                "/books/OL36460446M",
                "/books/OL38450840M",
                "/books/OL36080718M",
                "/books/OL36095055M",
                "/books/OL36488414M",
                "/books/OL36578711M",
                "/books/OL38136033M",
                "/books/OL34291639M",
                "/books/OL39171709M",
                "/books/OL38111688M",
                "/books/OL38553807M",
                "/books/OL38529109M",
                "/books/OL38147700M",
                "/books/OL38168813M",
                "/works/OL286343W",
                "/subjects/classic_literature",
                "/subjects/fiction",
                "/subjects/fiction_action_&_adventure",
                "/subjects/fiction_historical_general",
                "/subjects/france_history_revolution_1789-1799_fiction",
                "/subjects/blakeney_percy_sir_(fictitious_character)_fiction",
                "/subjects/france_fiction",
                "/subjects/fiction_romance_historical_general",
                "/subjects/fiction_romance_suspense",
                "/subjects/fiction_general",
                "/authors/OL7737529A"
            ],
            "title": "I Will Repay",
            "title_suggest": "I Will Repay",
            "title_sort": "I Will Repay",
            "edition_count": 122,
            "edition_key": [
                "OL21805320M",
                "OL18921433M",
                "OL9208329M",
                "OL16790876M",
                "OL20547948M",
                "OL20482365M",
                "OL13905680M",
                "OL10615594M",
                "OL18705861M",
                "OL8105424M",
                "OL8689653M",
                "OL10854348M",
                "OL11646631M",
                "OL9614243M",
                "OL8471064M",
                "OL12238925M",
                "OL8482957M",
                "OL8491234M",
                "OL9477577M",
                "OL24297726M",
                "OL8904395M",
                "OL11678444M",
                "OL9872251M",
                "OL12557855M",
                "OL12558053M",
                "OL9736456M",
                "OL9849622M",
                "OL9326639M",
                "OL37455653M",
                "OL35463200M",
                "OL35465967M",
                "OL35467463M",
                "OL35464645M",
                "OL35458875M",
                "OL28801941M",
                "OL35460662M",
                "OL35461676M",
                "OL37455755M",
                "OL35467138M",
                "OL35457447M",
                "OL35467233M",
                "OL35460763M",
                "OL34861365M",
                "OL36793201M",
                "OL27534487M",
                "OL27824463M",
                "OL36900998M",
                "OL30273579M",
                "OL37546159M",
                "OL30213039M",
                "OL39674271M",
                "OL39430421M",
                "OL36497240M",
                "OL38434696M",
                "OL37507060M",
                "OL37044832M",
                "OL36065067M",
                "OL36082539M",
                "OL36953938M",
                "OL38554429M",
                "OL36987438M",
                "OL36444456M",
                "OL36111798M",
                "OL37524185M",
                "OL38529626M",
                "OL38118407M",
                "OL36568628M",
                "OL34135386M",
                "OL38468055M",
                "OL37004911M",
                "OL38427235M",
                "OL37526880M",
                "OL36932503M",
                "OL38172123M",
                "OL38203459M",
                "OL38490541M",
                "OL38555218M",
                "OL38508121M",
                "OL34324573M",
                "OL37643677M",
                "OL38194222M",
                "OL37706488M",
                "OL34998747M",
                "OL36876701M",
                "OL38496286M",
                "OL36501179M",
                "OL36584978M",
                "OL38428996M",
                "OL36073298M",
                "OL36157348M",
                "OL36044334M",
                "OL37523531M",
                "OL37502760M",
                "OL35003167M",
                "OL36922658M",
                "OL36597470M",
                "OL38202639M",
                "OL36577153M",
                "OL36983505M",
                "OL38202482M",
                "OL38188143M",
                "OL38172097M",
                "OL36947604M",
                "OL37708068M",
                "OL34330950M",
                "OL36892332M",
                "OL36491809M",
                "OL35029244M",
                "OL36460446M",
                "OL38450840M",
                "OL36080718M",
                "OL36095055M",
                "OL36488414M",
                "OL36578711M",
                "OL38136033M",
                "OL34291639M",
                "OL39171709M",
                "OL38111688M",
                "OL38553807M",
                "OL38529109M",
                "OL38147700M",
                "OL38168813M"
            ],
            "publish_date": [
                "2022",
                "2004",
                "June 30, 2004",
                "September 1994",
                "September 27, 2007",
                "1950",
                "March 2000",
                "March 23, 2007",
                "March 2003",
                "Apr 03, 2018",
                "April 2001",
                "1907",
                "2009",
                "2011",
                "May 27, 2014",
                "2021",
                "2013",
                "October 30, 2005",
                "November 8, 2007",
                "2020",
                "1906",
                "July 1, 2007",
                "March 30, 2004",
                "2006",
                "October 12, 2007",
                "1900",
                "August 3, 2006",
                "1938",
                "2008",
                "January 1, 2007",
                "January 30, 2005"
            ],
            "publish_year": [
                2011,
                2022,
                2021,
                2014,
                2013,
                2004,
                2005,
                2020,
                2001,
                1906,
                2018,
                1950,
                2006,
                2003,
                1900,
                2007,
                1994,
                1938,
                2008,
                1907,
                2000,
                2009
            ],
            "first_publish_year": 1900,
            "number_of_pages_median": 207,
            "publish_place": [
                "Leicester",
                "London",
                "Fairfield"
            ],
            "oclc": [
                "76157510",
                "2116189",
                "233663286",
                "32736543",
                "45346514",
                "60491550",
                "182728256",
                "122430895"
            ],
            "contributor": [
                "Johanna Ward (Contributor)"
            ],
            "ddc": [
                "823.912",
                "823.91"
            ],
            "isbn": [
                "9798440762862",
                "9781404351998",
                "9798535756547",
                "9798483092445",
                "9997527534",
                "9780755116607",
                "1599865696",
                "9798764802381",
                "1600964516",
                "0755111141",
                "9798463335579",
                "9781604244908",
                "9781434116338",
                "9798499237281",
                "9798735398301",
                "9798503793437",
                "9798524010377",
                "1406824534",
                "9781406835854",
                "9781599865690",
                "9798574498903",
                "9798711696131",
                "9798462799006",
                "9781421801087",
                "0755116607",
                "9781419125188",
                "9798774659050",
                "1421801086",
                "9798744029296",
                "9781434603548",
                "9798835939107",
                "9798778084216",
                "9781604242775",
                "9781568497327",
                "1600969364",
                "9781625584274",
                "9781576469286",
                "1419225189",
                "9798478441227",
                "1438510438",
                "9798745355332",
                "1437839681",
                "9798546157746",
                "9798544018117",
                "9781404351981",
                "1404351981",
                "9781600964510",
                "0554353784",
                "9798473708974",
                "9781437839685",
                "9798511921365",
                "9798747883376",
                "9798800774436",
                "9781406824537",
                "1605120537",
                "1604244909",
                "9798790353734",
                "9798461246983",
                "9798408428182",
                "140435199X",
                "9798546042530",
                "9798734725757",
                "1437839622",
                "9798471870734",
                "9780554353784",
                "9798753484376",
                "9798532011311",
                "9798460814374",
                "9781434604279",
                "1434116328",
                "9798661259783",
                "9798467538464",
                "9781437839623",
                "0340069430",
                "9798533110112",
                "9780786107780",
                "9798518887770",
                "1434116336",
                "9780340069431",
                "1419125184",
                "9798706883195",
                "9798703536551",
                "9780554260754",
                "9798627016962",
                "9798440335165",
                "1600966314",
                "9798666301838",
                "1568497326",
                "9781605120539",
                "9798543567562",
                "9781605122533",
                "157646928X",
                "9798411939675",
                "9781600969362",
                "1421802082",
                "9798538638987",
                "1499671121",
                "9798734397671",
                "9798735145783",
                "9781463755287",
                "9798764485393",
                "9798515078034",
                "9789997527530",
                "9798572728125",
                "9798669011253",
                "9798455589553",
                "9798505876640",
                "9798509923029",
                "162558427X",
                "9781515430889",
                "1463755287",
                "9798522663247",
                "9798486053719",
                "9798728652526",
                "1406835854",
                "9798543576861",
                "9798511794617",
                "151543088X",
                "0786107782",
                "160512253X",
                "9798483254577",
                "9798479917158",
                "142180008X",
                "9798678627209",
                "9781421802084",
                "1604242779",
                "9798736994465",
                "9798485661038",
                "9781434116321",
                "1605121533",
                "9781600966316",
                "9798764072067",
                "0554260751",
                "9798533597319",
                "1434603547",
                "1434604276",
                "9798760264084",
                "9798538637973",
                "9798761932500",
                "9780755111145",
                "9781499671124",
                "9798739284129",
                "9781438510439",
                "9798564231541",
                "9798627789149",
                "9798736931293",
                "9781419225185",
                "9798719364551",
                "9781421800080",
                "9781406559767",
                "9798490495109",
                "9781605121536",
                "1406559768"
            ],
            "last_modified_i": 1678876269,
            "ebook_count_i": 3,
            "ebook_access": "public",
            "has_fulltext": true,
            "public_scan_b": true,
            "ia": [
                "iwillrepayaroma00orczgoog",
                "iwillrepayaroma01orczgoog"
            ],
            "ia_collection": [
                "americana"
            ],
            "ia_collection_s": "americana",
            "lending_edition_s": "OL20547948M",
            "lending_identifier_s": "iwillrepayaroma00orczgoog",
            "readinglog_count": 8,
            "want_to_read_count": 8,
            "currently_reading_count": 0,
            "already_read_count": 0,
            "cover_edition_key": "OL12238925M",
            "cover_i": 2928858,
            "first_sentence": [
                "IT would have been very difficult to say why Citizen Deroulede was quite so popular as he was.",
                "It would have been very difficult to say why Citizen Deroulede was quite so popular as he was."
            ],
            "publisher": [
                "The Editorium, LLC",
                "Standard Publications, Inc.",
                "Dodo Press",
                "IndyPublish.com",
                "J.B. Lippincott",
                "Buccaneer Books",
                "Kessinger Publishing",
                "BiblioBazaar",
                "Creative Media Partners, LLC",
                "Brockhampton Press",
                "Filiquarian Publishing, LLC",
                "SMK Books",
                "CreateSpace Independent Publishing Platform",
                "HarperCollins",
                "Standard Ebooks",
                "Eveleigh Nash & Grayson ltd.",
                "Book Jungle",
                "Akasha Publishing, LLC",
                "Greening",
                "Editorium, The",
                "Start Publishing LLC",
                "Echo Library",
                "Quiet Vision Pub",
                "Blackstone Audiobooks",
                "Independently Published",
                "House of Stratus",
                "Waking Lion Press",
                "Hodder and Stoughton",
                "Hodder & Stoughton",
                "House of Stratus, Incorporated",
                "1st World Library",
                "Brockhampton P"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL7737529A"
            ],
            "author_name": [
                "Emmuska Orczy, Baroness Orczy"
            ],
            "author_alternative_name": [
                "Emmuska Orczy",
                "Emmauska Orczy",
                "Baroness Emma Baroness Emma Orczy",
                "Baroness ORCZY",
                "Emma Magdalena Rosalia Maria Josefa Barbara Orczy",
                "Baroness Baroness Orczy",
                "The Elusive Pimpernel Illustrated Orczy",
                "Baroness Orczy",
                "Emmuska Orczy, Baroness Orczy",
                "Emmuska Orczy Orczy (Baroness)",
                "Emmuska ORCZY",
                "Baroness Emma Orczy",
                "Baronesa de Orczy Emmuska Orczy",
                "Emmuska Baroness Orczy",
                "Baroness Emmuska Orczy",
                "Emma Emma Orczy",
                "Baronne Emmuska Orczy",
                "Emmuska Orczy (Baroness)",
                "Baroness Emmuska Orczy Orczy",
                "Emmuska Orczy Baroness Orczy",
                "Baroness Emmuska Baroness Emmuska Orczy",
                "Emmuska Baroness Orczy de Orczi",
                "Emma Orczy",
                "Emmuska Orczy Orczy"
            ],
            "subject": [
                "Classic Literature",
                "Fiction",
                "Fiction, action & adventure",
                "Fiction, historical, general",
                "France, history, revolution, 1789-1799, fiction",
                "Blakeney, percy, sir (fictitious character), fiction",
                "France, fiction",
                "Fiction, romance, historical, general",
                "Fiction, romance, suspense",
                "Fiction, general"
            ],
            "id_amazon": [
                "151543088X",
                "1499671121"
            ],
            "id_goodreads": [
                "4339612",
                "2209896",
                "1283876",
                "2342896",
                "1061090",
                "136114",
                "2342923",
                "1180495",
                "6786027",
                "1149252",
                "54526",
                "353821"
            ],
            "id_librarything": [
                "465519"
            ],
            "id_overdrive": [
                "BEB2F705-3F8C-4BDE-BC7E-E5C6AB002DDC"
            ],
            "id_standard_ebooks": [
                "baroness-orczy/i-will-repay"
            ],
            "publisher_facet": [
                "1st World Library",
                "Akasha Publishing, LLC",
                "BiblioBazaar",
                "Blackstone Audiobooks",
                "Book Jungle",
                "Brockhampton P",
                "Brockhampton Press",
                "Buccaneer Books",
                "CreateSpace Independent Publishing Platform",
                "Creative Media Partners, LLC",
                "Dodo Press",
                "Echo Library",
                "Editorium, The",
                "Eveleigh Nash & Grayson ltd.",
                "Filiquarian Publishing, LLC",
                "Greening",
                "HarperCollins",
                "Hodder & Stoughton",
                "Hodder and Stoughton",
                "House of Stratus",
                "House of Stratus, Incorporated",
                "Independently Published",
                "IndyPublish.com",
                "J.B. Lippincott",
                "Kessinger Publishing",
                "Quiet Vision Pub",
                "SMK Books",
                "Standard Ebooks",
                "Standard Publications, Inc.",
                "Start Publishing LLC",
                "The Editorium, LLC",
                "Waking Lion Press"
            ],
            "subject_facet": [
                "Blakeney, percy, sir (fictitious character), fiction",
                "Classic Literature",
                "Fiction",
                "Fiction, action & adventure",
                "Fiction, general",
                "Fiction, historical, general",
                "Fiction, romance, historical, general",
                "Fiction, romance, suspense",
                "France, fiction",
                "France, history, revolution, 1789-1799, fiction"
            ],
            "_version_": 1767922945044250626,
            "author_facet": [
                "OL7737529A Emmuska Orczy, Baroness Orczy"
            ],
            "subject_key": [
                "blakeney_percy_sir_(fictitious_character)_fiction",
                "classic_literature",
                "fiction",
                "fiction_action__adventure",
                "fiction_general",
                "fiction_historical_general",
                "fiction_romance_historical_general",
                "fiction_romance_suspense",
                "france_fiction",
                "france_history_revolution_1789-1799_fiction"
            ],
            "ddc_sort": "823.912"
        },
        {
            "key": "/works/OL35158429W",
            "type": "work",
            "seed": [
                "/books/OL47542536M",
                "/works/OL35158429W",
                "/authors/OL10845157A",
                "/authors/OL9260402A"
            ],
            "title": "El sue\u00f1o de Tiny Cooper",
            "title_suggest": "El sue\u00f1o de Tiny Cooper",
            "title_sort": "El sue\u00f1o de Tiny Cooper",
            "edition_count": 1,
            "edition_key": [
                "OL47542536M"
            ],
            "publish_date": [
                "Nov 12, 2015"
            ],
            "publish_year": [
                2015
            ],
            "first_publish_year": 2015,
            "number_of_pages_median": 224,
            "isbn": [
                "841559481X",
                "9788415594819"
            ],
            "last_modified_i": 1681885720,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL47542536M",
            "cover_i": 14159915,
            "publisher": [
                "Nube de Tinta"
            ],
            "author_key": [
                "OL10845157A",
                "OL9260402A"
            ],
            "author_name": [
                "David Levithan",
                "Laura Mart\u00edn de Dios"
            ],
            "publisher_facet": [
                "Nube de Tinta"
            ],
            "_version_": 1767933237037891584,
            "author_facet": [
                "OL10845157A David Levithan",
                "OL9260402A Laura Mart\u00edn de Dios"
            ]
        },
        {
            "key": "/works/OL35158430W",
            "type": "work",
            "seed": [
                "/books/OL47542535M",
                "/works/OL35158430W",
                "/authors/OL10845157A",
                "/authors/OL9260402A"
            ],
            "title": "El sue\u00f1o de Tiny Cooper",
            "title_suggest": "El sue\u00f1o de Tiny Cooper",
            "title_sort": "El sue\u00f1o de Tiny Cooper",
            "edition_count": 1,
            "edition_key": [
                "OL47542535M"
            ],
            "publish_date": [
                "Nov 12, 2015"
            ],
            "publish_year": [
                2015
            ],
            "first_publish_year": 2015,
            "number_of_pages_median": 224,
            "isbn": [
                "841559481X",
                "9788415594819"
            ],
            "last_modified_i": 1681885720,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL47542535M",
            "cover_i": 14159914,
            "publisher": [
                "Nube de Tinta"
            ],
            "author_key": [
                "OL10845157A",
                "OL9260402A"
            ],
            "author_name": [
                "David Levithan",
                "Laura Mart\u00edn de Dios"
            ],
            "publisher_facet": [
                "Nube de Tinta"
            ],
            "_version_": 1767933237156380673,
            "author_facet": [
                "OL10845157A David Levithan",
                "OL9260402A Laura Mart\u00edn de Dios"
            ]
        }
    ],
    "num_found": 38,
    "q": "will grayson",
    "offset": null
}
                       """; 
      Search search = gson.fromJson(results, Search.class);
      for (Book b : search.getDocs()) {
         System.out.println(b.toString());
         System.out.println();
      }
   }
 }