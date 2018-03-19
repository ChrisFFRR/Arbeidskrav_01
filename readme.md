#PGR101 Arbeidskrav 01
a) En skole trenger et system for å holde orden på samlingen av ulike måleinstrumenter som
brukes i naturfagundervisningen. Eksempler på måleinstrumenter er termometer, klokke og
vekt.
Om alle måleinstrumentene skal det være registrert et entydig registreringsnummer (f.eks.
K1234), en opplysning om instrumentet er i orden eller ikke, og en plasseringskode (hvor
instrumentet kan finnes, f.eks. R24H3 – rom 24, hylle 3).
Om et termometer skal det i tillegg være opplysning om laveste og høyeste temperatur som
termometeret kan måle (i °C, desimaltall), om en klokke opplysning om minste tidsintervall
som klokken kan måle (i sekunder, desimaltall), og om en vekt opplysning om minste og
største vekt som vekten kan måle (i gram, desimaltall).
Med utgangspunkt i typene termometer, klokke og vekt skal klassene Thermometer,
Clock og Weight skrives. Disse skal være subklasser av en klasse Meter
(måleinstrument).
Klassene har standard parametrisk og ikke-parametrisk konstruktør i tillegg til standard
tilgangsmetoder, toString-metode og passende equals-metode.

b) Skriv en klasse MeterArchive med metoder for å legge til, hente, endre og slette
måleinstrumenter. Klassen bruker en passende List for å holde på instrumentene.
Metoden for å legge til instrument skal ha en referanse til et måleinstrument som parameter.
Metoden for å hente og slette et instrument skal ha et registreringsnummer som parameter.
Metoden for å hente returnerer null hvis instrumentet ikke finnes, og metoden for å
slette returnerer true hvis slettingen gikk å utføre.
Klassen skal ha to metoder for å endre et instrument. Den ene har en String for
registreringsnummer og en ny plassering som parameter. Den andre har en String for
registreringsnummer som parameter og skal endre instrumentet slik at det blir registret som
ikke i orden. Begge metodene skal returnere true hvis endringen ble utført.
Klassen skal også ha en metode som returnerer alle instrumentene på en passende måte.

c) Skriv en klasse Client med en metode mainMethod. Denne metoden oppretter et
objekt av klassen MeterArchive og bruker dette til å registrere noen måleinstrumenter,
og bruker MeterArchive sine metoder beskrevet over på riktig måte.

#Getting started

option 1\
run mainclass "Client" and watch the magic happen in terminal.

option 2\
open jar file in terminal/cmn (java -jar Arbeidskrav_01.jar) and watch the magic happen.

#Author
Christopher Marchand

