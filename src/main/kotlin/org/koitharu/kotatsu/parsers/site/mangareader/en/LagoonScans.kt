package org.koitharu.kotatsu.parsers.site.mangareader.ar

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.MangaParserSource
import org.koitharu.kotatsu.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("LAGOONSCANS", "Lagoon Scans", "en")
internal class MangaFlame(context: MangaLoaderContext) :
    MangaReaderParser(context, MangaParserSource.MANGAFLAME, "lagoonscans.com", pageSize = 20, searchPageSize = 10)
