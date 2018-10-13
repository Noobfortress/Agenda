@file:JvmName("Main")
package Agenda

import Agenda.Logic.Template
import Agenda.Util.*

fun main(args: Array<String>) {
    Template.write(Week(
            41,
            Day(Weekday.MONDAY, SimpleDate(8, 10), arrayOf(
                    Event("Wiskunde B",  "wisb", "(114)",  SimpleTime(8,  10), SimpleTime(9,  0)),
                    Event("Scheikunde",  "sk",   "(015)",  SimpleTime(9,  50), SimpleTime(10, 40)),
                    Event("Engels",      "en",   "(L-c2)", SimpleTime(11, 50), SimpleTime(12, 40)),
                    Event("Natuurkunde", "na",   "(019)",  SimpleTime(13, 10), SimpleTime(14, 0))
            )),
            Day(Weekday.TUESDAY, SimpleDate(9, 10), arrayOf(
                    Event("Wiskunde B",  "wisb",   "(114)",          SimpleTime(8,  10), SimpleTime(9,  50)),
                    Event("Wiskunde D",  "wisd",   "(114)",          SimpleTime(9,  50), SimpleTime(10, 40)),
                    Event("Nederlands",  "nl",     "(110)",          SimpleTime(11, 0),  SimpleTime(11, 50)),
                    Event("Natuurkunde", "na",     "(016)",          SimpleTime(11, 50), SimpleTime(12, 40)),
                    Event("Informatica", "in",     "(107)",          SimpleTime(13, 10), SimpleTime(14, 0)),
                    Event("Engels",      "en",     "(L-c2)",         SimpleTime(14, 0),  SimpleTime(14, 50)),
                    Event("Werken",      "werken", "(markt, Ommen)", SimpleTime(17, 30),  SimpleTime(20, 30))
            )),
            Day(Weekday.WEDNESDAY, SimpleDate(10, 10), arrayOf(
                    Event("Informatica", "in", "(107)", SimpleTime(8,  10), SimpleTime(9,  0)),
                    Event("Natuurkunde", "na", "(019)", SimpleTime(9,  50), SimpleTime(10, 40)),
                    Event("Informatica", "in", "(107)", SimpleTime(11, 0),  SimpleTime(11, 50)),
                    Event("Scheikunde",  "sk", "(015)", SimpleTime(11, 50), SimpleTime(12, 40)),
                    Event("Duits",       "du", "(113)", SimpleTime(13, 10), SimpleTime(14, 0))
            )),
            Day(Weekday.THURSDAY, SimpleDate(11, 10), arrayOf(
                    Event("Godsdienst",  "gd", "(109)",  SimpleTime(9, 0),   SimpleTime(9, 50)),
                    Event("Natuurkunde", "na", "(015)",  SimpleTime(9, 50),  SimpleTime(10, 40)),
                    Event("Nederlands",  "nl", "(110)",  SimpleTime(11, 0),  SimpleTime(12, 40)),
                    Event("Duits",       "du", "(113)",  SimpleTime(13, 10), SimpleTime(14, 0)),
                    Event("Engels",      "en", "(L-c2)", SimpleTime(14, 0),  SimpleTime(14, 50)),
                    Event("Scheikunde",  "sk", "(015)",  SimpleTime(14, 50), SimpleTime(15, 40))
            )),
            Day(Weekday.FRIDAY, SimpleDate(12, 10), arrayOf(
                    Event("Wiskunde D",             "wisd", "(114)", SimpleTime(8, 10),  SimpleTime(9,  0)),
                    Event("Duits",                  "du",   "(113)", SimpleTime(9, 0),   SimpleTime(9, 50)),
                    Event("Wiskunde B",             "wisb", "(114)", SimpleTime(9, 50),  SimpleTime(10, 40)),
                    Event("Lichamelijke Opvoeding", "lo",   "(spv)", SimpleTime(11, 50), SimpleTime(13, 30))
            )),
            Day(Weekday.SATURDAY, SimpleDate(13, 10), arrayOf(
                    Event("Werken", "werken", "markt, Ommen", SimpleTime(13, 0), SimpleTime(18, 0))
            )),
            Day(Weekday.SUNDAY, SimpleDate(14, 10), arrayOf())
    ))
}

/* Schema voor week 41
Week(
    41,
    Day(Weekday.MONDAY, SimpleDate(8, 10), arrayOf(
        Event("Wiskunde B",  "wisb", "(114)",  SimpleTime(8,  10), SimpleTime(9,  0)),
        Event("Scheikunde",  "sk",   "(015)",  SimpleTime(9,  50), SimpleTime(10, 40)),
        Event("Engels",      "en",   "(L-c2)", SimpleTime(11, 50), SimpleTime(12, 40)),
        Event("Natuurkunde", "na",   "(019)",  SimpleTime(13, 10), SimpleTime(14, 0))
    )),
    Day(Weekday.TUESDAY, SimpleDate(9, 10), arrayOf(
        Event("Wiskunde B",  "wisb",   "(114)",          SimpleTime(8,  10), SimpleTime(9,  50)),
        Event("Wiskunde D",  "wisd",   "(114)",          SimpleTime(9,  50), SimpleTime(10, 40)),
        Event("Nederlands",  "nl",     "(110)",          SimpleTime(11, 0),  SimpleTime(11, 50)),
        Event("Natuurkunde", "na",     "(016)",          SimpleTime(11, 50), SimpleTime(12, 40)),
        Event("Informatica", "in",     "(107)",          SimpleTime(13, 10), SimpleTime(14, 0)),
        Event("Engels",      "en",     "(L-c2)",         SimpleTime(14, 0),  SimpleTime(14, 50)),
        Event("Werken",      "werken", "(markt, Ommen)", SimpleTime(17, 30),  SimpleTime(20, 30))
    )),
    Day(Weekday.WEDNESDAY, SimpleDate(10, 10), arrayOf(
        Event("Informatica", "in", "(107)", SimpleTime(8,  10), SimpleTime(9,  0)),
        Event("Natuurkunde", "na", "(019)", SimpleTime(9,  50), SimpleTime(10, 40)),
        Event("Informatica", "in", "(107)", SimpleTime(11, 0),  SimpleTime(11, 50)),
        Event("Scheikunde",  "sk", "(015)", SimpleTime(11, 50), SimpleTime(12, 40)),
        Event("Duits",       "du", "(113)", SimpleTime(13, 10), SimpleTime(14, 0))
    )),
    Day(Weekday.THURSDAY, SimpleDate(11, 10), arrayOf(
        Event("Godsdienst",  "gd", "(109)",  SimpleTime(9, 0),   SimpleTime(9, 50)),
        Event("Natuurkunde", "na", "(015)",  SimpleTime(9, 50),  SimpleTime(10, 40)),
        Event("Nederlands",  "nl", "(110)",  SimpleTime(11, 0),  SimpleTime(12, 40)),
        Event("Duits",       "du", "(113)",  SimpleTime(13, 10), SimpleTime(14, 0)),
        Event("Engels",      "en", "(L-c2)", SimpleTime(14, 0),  SimpleTime(14, 50)),
        Event("Scheikunde",  "sk", "(015)",  SimpleTime(14, 50), SimpleTime(15, 40))
    )),
    Day(Weekday.FRIDAY, SimpleDate(12, 10), arrayOf(
        Event("Wiskunde D",             "wisd", "(114)", SimpleTime(8, 10),  SimpleTime(9,  0)),
        Event("Duits",                  "du",   "(113)", SimpleTime(9, 0),   SimpleTime(9, 50)),
        Event("Wiskunde B",             "wisb", "(114)", SimpleTime(9, 50),  SimpleTime(10, 40)),
        Event("Lichamelijke Opvoeding", "lo",   "(spv)", SimpleTime(11, 50), SimpleTime(13, 30))
    )),
    Day(Weekday.SATURDAY, SimpleDate(13, 10), arrayOf(
        Event("Werken", "werken", "markt, Ommen", SimpleTime(13, 0), SimpleTime(18, 0))
    )),
    Day(Weekday.SUNDAY, SimpleDate(14, 10), arrayOf())
)
 */