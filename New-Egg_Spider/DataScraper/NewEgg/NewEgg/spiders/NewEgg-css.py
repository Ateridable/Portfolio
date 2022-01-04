import scrapy 

class ScrapeCSSSpider(scrapy.Spider):
    name = "NewEgg-css"
    start_urls = [
        'https://www.newegg.com/Desktop-Graphics-Cards/SubCategory/ID-48?Tid=7709',
    ]
    
    def parse(self, response):
        for container in response.css("div.item-cell"):
            yield {
                'name': container.css("a.item-title::text").extract_first(),
                'price': container.css("li.price-current::strong").extract(),
            }