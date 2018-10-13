package Agenda.Logic

import Agenda.Util.Event
import Agenda.Util.Week
import java.io.File
import java.util.*

object Template {

    @JvmStatic fun write(week: Week) {
        var template = ""
        Scanner(Template::class.java.getResourceAsStream("/Sources/template.html")).useDelimiter("\\A").use{
            template = it.next()
        }

        template = template.replace("[weeknum]", week.number.toString())
        for (day in week.days) {
            val dayname = day.name.short
            template = template.replace("[date-$dayname]", day.date.toString())

            var eventString = ""

            for (event in day.events)
                eventString += getEventString(event)
            template = template.replace("[events-$dayname]", eventString)
        }
        File("Generated-w${week.number}.html").bufferedWriter().use {it.write(template)}
    }

    @JvmStatic fun getEventString(event: Event): String =
            "<li class=\"single-event\" " +
            "data-start=\"${event.start}\" " +
            "data-end=\"${event.end}\" " +
            "data-content=\"${event.getDataContent()}\" " +
            "data-event=\"${event.short}\">\n" +
            "<a href=\"#0\">\n" +
            "<em class=\"event-name\">${event.name}</em>\n" +
            "<em class=\"event-date\">${event.location}</em>\n" +
            "</a>\n" + "</li>"
}