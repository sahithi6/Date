package com.findlg.core.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.findlg.core.model.Application;
import com.findlg.core.model.Dataprovider;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/FINDLG1")
public class RestController {

	@GetMapping(path = "/getJSON1", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> doGetJson() {

		Application app=new Application();
		Dataprovider dataprovider = new Dataprovider("2012-07-27",13);
		Dataprovider dataprovider1 = new Dataprovider("2012-07-28",11);
		Dataprovider dataprovider2 = new Dataprovider("2012-07-29",15);
		Dataprovider dataprovider3 = new Dataprovider("2012-07-30",16);
		Dataprovider dataprovider4 = new Dataprovider("2012-07-31",18);
		Dataprovider dataprovider5 = new Dataprovider("2012-08-01",13);
		Dataprovider dataprovider6 = new Dataprovider("2012-08-02",22);
		Dataprovider dataprovider7 = new Dataprovider("2012-08-03",23);
		Dataprovider dataprovider8 = new Dataprovider("2012-08-04",20);
		Dataprovider dataprovider9= new Dataprovider("2012-08-05",17);
		Dataprovider dataprovider10 = new Dataprovider("2012-08-06",16);
		Dataprovider dataprovider11 = new Dataprovider("2012-08-07",18);
		Dataprovider dataprovider12 = new Dataprovider("2012-08-08",21);
		Dataprovider dataprovider13 = new Dataprovider("2012-08-09",26);
		Dataprovider dataprovider14 = new Dataprovider("2012-08-10",24);
		Dataprovider dataprovider15 = new Dataprovider("2012-08-11",29);
		Dataprovider dataprovider16 = new Dataprovider("2012-08-12",32);
		Dataprovider dataprovider17 = new Dataprovider("2012-08-13",18);
		Dataprovider dataprovider18 = new Dataprovider("2012-08-14",24);
		Dataprovider dataprovider19 = new Dataprovider("2012-08-15",22);
		Dataprovider dataprovider20 = new Dataprovider("2012-08-16",18);
		Dataprovider dataprovider21 = new Dataprovider("2012-08-17",19);
		Dataprovider dataprovider22 = new Dataprovider("2012-08-18",14);
		Dataprovider dataprovider23 = new Dataprovider("2012-08-19",15);
		Dataprovider dataprovider24 = new Dataprovider("2012-08-20",12);
		Dataprovider dataprovider25 = new Dataprovider("2012-08-21",8);
		Dataprovider dataprovider26 = new Dataprovider("2012-08-22",9);
		Dataprovider dataprovider27 = new Dataprovider("2012-08-23",8);
		Dataprovider dataprovider28 = new Dataprovider("2012-08-24",7);
		Dataprovider dataprovider29 = new Dataprovider("2012-08-25",5);
		Dataprovider dataprovider30 = new Dataprovider("2012-08-26",11);
		Dataprovider dataprovider31 = new Dataprovider("2012-08-27",13);
		Dataprovider dataprovider32 = new Dataprovider("2012-08-28",18);
		Dataprovider dataprovider33 = new Dataprovider("2012-08-29",20);
		Dataprovider dataprovider34 = new Dataprovider("2012-08-30",29);
		Dataprovider dataprovider35 = new Dataprovider("2012-08-31",33);
		Dataprovider dataprovider36 = new Dataprovider("2012-09-01",42);
		Dataprovider dataprovider37 = new Dataprovider("2012-09-02",35);
		Dataprovider dataprovider38 = new Dataprovider("2012-09-03",31);
		Dataprovider dataprovider39 = new Dataprovider("2012-09-04",47);
		Dataprovider dataprovider40 = new Dataprovider("2012-09-05",52);
		Dataprovider dataprovider41 = new Dataprovider("2012-09-06",46);
		Dataprovider dataprovider42 = new Dataprovider("2012-09-07",41);
		Dataprovider dataprovider43 = new Dataprovider("2012-09-08",43);
		Dataprovider dataprovider44 = new Dataprovider("2012-09-09",40);
		Dataprovider dataprovider45 = new Dataprovider("2012-09-10",39);
		Dataprovider dataprovider46 = new Dataprovider("2012-09-11",34);
		Dataprovider dataprovider47 = new Dataprovider("2012-09-12",29);
		Dataprovider dataprovider48 = new Dataprovider("2012-09-13",34);
		Dataprovider dataprovider49 = new Dataprovider("2012-09-14",37);
		Dataprovider dataprovider50 = new Dataprovider("2012-09-15",42);
		Dataprovider dataprovider51 = new Dataprovider("2012-09-16",49);
		Dataprovider dataprovider52 = new Dataprovider("2012-09-17",46);
		Dataprovider dataprovider53 = new Dataprovider("2012-09-18",47);
		Dataprovider dataprovider54 = new Dataprovider("2012-09-19",55);
		Dataprovider dataprovider55 = new Dataprovider("2012-09-20",59);
		Dataprovider dataprovider56 = new Dataprovider("2012-09-21",58);
		Dataprovider dataprovider57 = new Dataprovider("2012-09-22",57);
		Dataprovider dataprovider58 = new Dataprovider("2012-09-23",61);
		Dataprovider dataprovider59 = new Dataprovider("2012-09-24",59);
		Dataprovider dataprovider60 = new Dataprovider("2012-09-25",67);
		Dataprovider dataprovider61 = new Dataprovider("2012-09-26",65);
		Dataprovider dataprovider62 = new Dataprovider("2012-09-27",61);
		Dataprovider dataprovider63 = new Dataprovider("2012-09-28",66);
		Dataprovider dataprovider64 = new Dataprovider("2012-09-29",69);
		Dataprovider dataprovider65 = new Dataprovider("2012-09-30",71);
		Dataprovider dataprovider66 = new Dataprovider("2012-10-01",67);
		Dataprovider dataprovider67 = new Dataprovider("2012-10-02",63);
		Dataprovider dataprovider68 = new Dataprovider("2012-10-03",46);
		Dataprovider dataprovider69 = new Dataprovider("2012-10-04",32);
		Dataprovider dataprovider70 = new Dataprovider("2012-10-05",21);
		Dataprovider dataprovider71 = new Dataprovider("2012-10-06",18);
		Dataprovider dataprovider72 = new Dataprovider("2012-10-07",21);
		Dataprovider dataprovider73 = new Dataprovider("2012-10-08",28);
		Dataprovider dataprovider74 = new Dataprovider("2012-10-09",27);
		Dataprovider dataprovider75 = new Dataprovider("2012-10-10",36);
		Dataprovider dataprovider76 = new Dataprovider("2012-10-11",33);
		Dataprovider dataprovider77 = new Dataprovider("2012-10-12",31);
		Dataprovider dataprovider78 = new Dataprovider("2012-10-13",30);
		Dataprovider dataprovider79 = new Dataprovider("2012-10-14",34);
		Dataprovider dataprovider80 = new Dataprovider("2012-10-15",38);
		Dataprovider dataprovider81 = new Dataprovider("2012-10-16",37);
		Dataprovider dataprovider82 = new Dataprovider("2012-10-17",44);
		Dataprovider dataprovider83 = new Dataprovider("2012-10-18",49);
		Dataprovider dataprovider84 = new Dataprovider("2012-10-19",53);
		Dataprovider dataprovider85 = new Dataprovider("2012-10-20",57);
		Dataprovider dataprovider86 = new Dataprovider("2012-10-21",60);
		Dataprovider dataprovider87 = new Dataprovider("2012-10-22",61);
		Dataprovider dataprovider88 = new Dataprovider("2012-10-23",69);
		Dataprovider dataprovider89 = new Dataprovider("2012-10-24",67);
		Dataprovider dataprovider90 = new Dataprovider("2012-10-25",72);
		Dataprovider dataprovider91 = new Dataprovider("2012-10-26",77);
		Dataprovider dataprovider92 = new Dataprovider("2012-10-27",75);
		Dataprovider dataprovider93 = new Dataprovider("2012-10-28",70);
		Dataprovider dataprovider94 = new Dataprovider("2012-10-29",72);
		Dataprovider dataprovider95 = new Dataprovider("2012-10-30",70);
		Dataprovider dataprovider96 = new Dataprovider("2012-10-31",72);
		Dataprovider dataprovider97 = new Dataprovider("2012-11-01",73);
		Dataprovider dataprovider98 = new Dataprovider("2012-11-02",67);
		Dataprovider dataprovider99 = new Dataprovider("2012-11-03",68);
		Dataprovider dataprovider100 = new Dataprovider("2012-11-04",65);
		Dataprovider dataprovider101 = new Dataprovider("2012-11-05",71);
		Dataprovider dataprovider102 = new Dataprovider("2012-11-06",75);
		Dataprovider dataprovider103 = new Dataprovider("2012-11-07",74);
		Dataprovider dataprovider104 = new Dataprovider("2012-11-08",71);
		Dataprovider dataprovider105 = new Dataprovider("2012-11-09",76);
		Dataprovider dataprovider106 = new Dataprovider("2012-11-10",77);
		Dataprovider dataprovider107 = new Dataprovider("2012-11-11",81);
		Dataprovider dataprovider108 = new Dataprovider("2012-11-12",83);
		Dataprovider dataprovider109 = new Dataprovider("2012-11-13",80);
		Dataprovider dataprovider110 = new Dataprovider("2012-11-14",81);
		Dataprovider dataprovider111 = new Dataprovider("2012-11-15",87);
		Dataprovider dataprovider112 = new Dataprovider("2012-11-16",82);
		Dataprovider dataprovider113 = new Dataprovider("2012-11-17",86);
		Dataprovider dataprovider114 = new Dataprovider("2012-11-18",80);
		Dataprovider dataprovider115 = new Dataprovider("2012-11-19",87);
		Dataprovider dataprovider116 = new Dataprovider("2012-11-20",83);
		Dataprovider dataprovider117 = new Dataprovider("2012-11-21",85);
		Dataprovider dataprovider118 = new Dataprovider("2012-11-22",84);
		Dataprovider dataprovider119 = new Dataprovider("2012-11-23",82);
		Dataprovider dataprovider120 = new Dataprovider("2012-11-24",73);
		Dataprovider dataprovider121 = new Dataprovider("2012-11-25",71);
		Dataprovider dataprovider122 = new Dataprovider("2012-11-26",75);
		Dataprovider dataprovider123 = new Dataprovider("2012-11-27",79);
		Dataprovider dataprovider124 = new Dataprovider("2012-11-28",70);
		Dataprovider dataprovider125 = new Dataprovider("2012-11-29",73);
		Dataprovider dataprovider126 = new Dataprovider("2012-11-30",61);
		Dataprovider dataprovider127 = new Dataprovider("2012-12-01",62);
		Dataprovider dataprovider128 = new Dataprovider("2012-12-02",66);
		Dataprovider dataprovider129 = new Dataprovider("2012-12-03",65);
		Dataprovider dataprovider130 = new Dataprovider("2012-12-04",73);
		Dataprovider dataprovider131 = new Dataprovider("2012-12-05",79);
		Dataprovider dataprovider132 = new Dataprovider("2012-12-06",78);
		Dataprovider dataprovider133 = new Dataprovider("2012-12-07",78);
		Dataprovider dataprovider134 = new Dataprovider("2012-12-08",78);
		Dataprovider dataprovider135 = new Dataprovider("2012-12-09",74);
		Dataprovider dataprovider136 = new Dataprovider("2012-12-10",73);
		Dataprovider dataprovider137 = new Dataprovider("2012-12-11",75);
		Dataprovider dataprovider138 = new Dataprovider("2012-12-12",70);
		Dataprovider dataprovider139 = new Dataprovider("2012-12-13",77);
		Dataprovider dataprovider140 = new Dataprovider("2012-12-14",67);
		Dataprovider dataprovider141 = new Dataprovider("2012-12-15",62);
		Dataprovider dataprovider142 = new Dataprovider("2012-12-16",64);
		Dataprovider dataprovider143 = new Dataprovider("2012-12-17",61);
		Dataprovider dataprovider144 = new Dataprovider("2012-12-18",59);
		Dataprovider dataprovider145 = new Dataprovider("2012-12-19",53);
		Dataprovider dataprovider146 = new Dataprovider("2012-12-20",54);
		Dataprovider dataprovider147 = new Dataprovider("2012-12-21",56);
		Dataprovider dataprovider148 = new Dataprovider("2012-12-22",59);
		Dataprovider dataprovider149 = new Dataprovider("2012-12-23",58);
		Dataprovider dataprovider150 = new Dataprovider("2012-12-24",55);
		Dataprovider dataprovider151 = new Dataprovider("2012-12-25",52);
		Dataprovider dataprovider152 = new Dataprovider("2012-12-26",54);
		Dataprovider dataprovider153 = new Dataprovider("2012-12-27",50);
		Dataprovider dataprovider154 = new Dataprovider("2012-12-28",50);
		Dataprovider dataprovider155 = new Dataprovider("2012-12-29",51);
		Dataprovider dataprovider156 = new Dataprovider("2012-12-30",52);
		Dataprovider dataprovider157 = new Dataprovider("2012-12-31",58);
		Dataprovider dataprovider158 = new Dataprovider("2013-01-01",60);
		Dataprovider dataprovider159 = new Dataprovider("2013-01-02",67);
		Dataprovider dataprovider160 = new Dataprovider("2013-01-03",64);
		Dataprovider dataprovider161 = new Dataprovider("2013-01-04",66);
		Dataprovider dataprovider162 = new Dataprovider("2013-01-05",60);
		Dataprovider dataprovider163 = new Dataprovider("2013-01-06",63);
		Dataprovider dataprovider164 = new Dataprovider("2013-01-07",61);
		Dataprovider dataprovider165 = new Dataprovider("2013-01-08",60);
		Dataprovider dataprovider166 = new Dataprovider("2013-01-09",65);
		Dataprovider dataprovider167 = new Dataprovider("2013-01-10",75);
		Dataprovider dataprovider168 = new Dataprovider("2013-01-11",77);
		Dataprovider dataprovider169 = new Dataprovider("2013-01-12",78);
		Dataprovider dataprovider170 = new Dataprovider("2013-01-13",70);
		Dataprovider dataprovider171 = new Dataprovider("2013-01-14",70);
		Dataprovider dataprovider172 = new Dataprovider("2013-01-15",73);
		Dataprovider dataprovider173 = new Dataprovider("2013-01-16",71);
		Dataprovider dataprovider174 = new Dataprovider("2013-01-17",74);
		Dataprovider dataprovider175 = new Dataprovider("2013-01-18",78);
		Dataprovider dataprovider176 = new Dataprovider("2013-01-19",85);
		Dataprovider dataprovider177 = new Dataprovider("2013-01-20",82);
		Dataprovider dataprovider178 = new Dataprovider("2013-01-21",83);
		Dataprovider dataprovider179 = new Dataprovider("2013-01-22",88);
		Dataprovider dataprovider180 = new Dataprovider("2013-01-23",85);
		Dataprovider dataprovider181 = new Dataprovider("2013-01-24",85);
		Dataprovider dataprovider182 = new Dataprovider("2013-01-25",80);
		Dataprovider dataprovider183 = new Dataprovider("2013-01-26",87);
		Dataprovider dataprovider184 = new Dataprovider("2013-01-27",84);
		Dataprovider dataprovider185 = new Dataprovider("2013-01-28",83);
		Dataprovider dataprovider186 = new Dataprovider("2013-01-29",84);
		Dataprovider dataprovider187 = new Dataprovider("2013-01-30",81);

		app.setDataprovider(new Dataprovider[] {dataprovider,dataprovider1,dataprovider2,
				dataprovider3,dataprovider4,dataprovider5,dataprovider6,dataprovider7,dataprovider8,dataprovider9,dataprovider10,dataprovider11,dataprovider12,
				dataprovider13,dataprovider14,dataprovider15,dataprovider16,dataprovider17,dataprovider18,dataprovider19,dataprovider20
				,dataprovider21,dataprovider22,
				dataprovider23,dataprovider24,dataprovider25,dataprovider26,dataprovider27,dataprovider28,dataprovider29,dataprovider30
				,dataprovider31,dataprovider32,
				dataprovider33,dataprovider34,dataprovider35,dataprovider36,dataprovider37,dataprovider38,dataprovider39,dataprovider40
				,dataprovider41,dataprovider42,
				dataprovider43,dataprovider44,dataprovider45,dataprovider46,dataprovider47,dataprovider48,dataprovider49,dataprovider50
				,dataprovider51,dataprovider52,
				dataprovider53,dataprovider54,dataprovider55,dataprovider56,dataprovider57,dataprovider58,dataprovider59,dataprovider60
				,dataprovider61,dataprovider62,
				dataprovider63,dataprovider64,dataprovider65,dataprovider66,dataprovider67,dataprovider68,dataprovider69,dataprovider70
				,dataprovider71,dataprovider72,
				dataprovider73,dataprovider74,dataprovider75,dataprovider76,dataprovider77,dataprovider78,dataprovider79,dataprovider80
				,dataprovider81,dataprovider82,
				dataprovider83,dataprovider84,dataprovider85,dataprovider86,dataprovider87,dataprovider88,dataprovider89,dataprovider90
				,dataprovider91,dataprovider92,
				dataprovider93,dataprovider94,dataprovider95,dataprovider96,dataprovider97,dataprovider98,dataprovider99,dataprovider100
				,dataprovider101,dataprovider102,
				dataprovider103,dataprovider104,dataprovider105,dataprovider106,dataprovider107,dataprovider108,dataprovider109,dataprovider110
				,dataprovider111,dataprovider112,
				dataprovider113,dataprovider114,dataprovider115,dataprovider116,dataprovider117,dataprovider118,dataprovider119,dataprovider120
				,dataprovider121,dataprovider122,
				dataprovider123,dataprovider124,dataprovider125,dataprovider126,dataprovider127,dataprovider128,dataprovider129,dataprovider130
				,dataprovider131,dataprovider132,
				dataprovider133,dataprovider134,dataprovider135,dataprovider136,dataprovider137,dataprovider138,dataprovider139,dataprovider140
				,dataprovider141,dataprovider142,
				dataprovider143,dataprovider144,dataprovider145,dataprovider146,dataprovider147,dataprovider148,dataprovider149,dataprovider150
				,dataprovider151,dataprovider152,
				dataprovider153,dataprovider154,dataprovider155,dataprovider156,dataprovider157,dataprovider158,dataprovider159,dataprovider160
				,dataprovider161,dataprovider162,
				dataprovider163,dataprovider164,dataprovider165,dataprovider166,dataprovider167,dataprovider168,dataprovider169,dataprovider170
				,dataprovider171,dataprovider172,
				dataprovider173,dataprovider174,dataprovider175,dataprovider176,dataprovider177,dataprovider178,dataprovider179,dataprovider180
				,dataprovider181,dataprovider182,
				dataprovider183,dataprovider184,dataprovider185,dataprovider186,dataprovider187});
		
		return new ResponseEntity<>(app, HttpStatus.OK);

	}
}