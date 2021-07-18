# JavaCamp

Kamp sürecinde yazılan kaynak kodlar ve ödev çalışmalarım.

# Day 1
## 1)Intro
![1-intro](https://user-images.githubusercontent.com/57464067/117744297-16b3c380-b211-11eb-9e95-eeb33dc9dec6.png)
# Day 2
## 2)oopIntro
![2-oopIntro](https://user-images.githubusercontent.com/57464067/117744313-1d423b00-b211-11eb-9338-292831ec93a8.png)
## 2.1)oopIntro ~ Homework
![2 1- oopintro](https://user-images.githubusercontent.com/57464067/117744302-1a474a80-b211-11eb-9f95-08929abf5725.png)

![2 1-oopintro-2](https://user-images.githubusercontent.com/57464067/117744308-1c110e00-b211-11eb-94bc-deee25d6932a.png)
# Day 3
## 3)oopIntro2
![3-oopintro2](https://user-images.githubusercontent.com/57464067/117744338-26cba300-b211-11eb-9459-251ed42a28cc.png)
## 3.1)inheritance
![3 1-inheritance](https://user-images.githubusercontent.com/57464067/117744320-1fa49500-b211-11eb-8108-ac11bc363857.png)
## 3.2)inheritance2
![3 2-inheritance2](https://user-images.githubusercontent.com/57464067/117744333-23d0b280-b211-11eb-998a-5e02d1b977b7.png)
## 3.3)inheritance ~ Homework
![3 3-inheritance-homework](https://user-images.githubusercontent.com/57464067/117744334-259a7600-b211-11eb-911d-415f134ad4d8.png)
# Day 4
## 4)interfaces
![4-interfaces](https://user-images.githubusercontent.com/57464067/117744887-27186e00-b212-11eb-950a-55778dc5d66d.png)
## 4.1)MernisCoffee
![4 1-merniscoffe](https://user-images.githubusercontent.com/57464067/117744342-28956680-b211-11eb-9edb-85eda3a5a127.png)
## 4.2)GameBackEnd
![4 2-gamebackend](https://user-images.githubusercontent.com/57464067/117744350-2af7c080-b211-11eb-9da9-1b40d3ee9b38.png)

![4 2-gamebackend2](https://user-images.githubusercontent.com/57464067/117744352-2cc18400-b211-11eb-820c-9358284b1ec6.png)
# Day 5
## 5)nLayeredDemo
![5-nlayereddemo](https://user-images.githubusercontent.com/57464067/117744366-334ffb80-b211-11eb-9fa8-0a16f4a16a21.png)
## 5.1)E-commerce
![5 1-ecommerce](https://user-images.githubusercontent.com/57464067/117744359-30eda180-b211-11eb-9d73-a0ff9956b7be.png)
# Day 6
## 6)northwind
![ss_springinitializr](https://user-images.githubusercontent.com/57464067/118120831-2a218300-b3f9-11eb-8b28-78c5eb3d350b.png)

![6](https://user-images.githubusercontent.com/57464067/117744371-34812880-b211-11eb-8fb2-3950d90eedaa.png)
## 6.1)VeritabanıTasarımıKursu
- Soyutlama ve miras alma odaklı tasarım yapıldı.
- Single Responsibility ve Open Closed prensiplerine uyuldu.
- Primary key tabloların, foreign key tablolar hakkında bilgi tutmamasına dikkat edildi.
- Bir daha tekrarlanmaması gereken veriler için unique key verildi.
- Nesnel bir veritabanı tasarımı gerçekleştirilmiş oldu.

![senaryo](https://user-images.githubusercontent.com/57464067/118120832-2aba1980-b3f9-11eb-9ac1-1a9e93d8c3c9.png)

![tablolar](https://user-images.githubusercontent.com/57464067/118120828-28f05600-b3f9-11eb-88d1-b8afc7c59ce5.png)

## 6.2)HRMS-PostgreSQL

- Veritabanı ismi hrms olarak belirlendi.
- pgAdmin4 ile oluşturuldu.
- Single Responsibility ve Open Closed prensiplerine uyuldu.
- Tüm istekler yerine getirildi. (req1, req2, req3)
- Nesnel bir veritabanı tasarımı gerçekleştirilmiş oldu.

![Database](https://user-images.githubusercontent.com/57464067/119281965-70b87e00-bc40-11eb-9e11-81e7f1558f9d.png)

## 6.3)HRMS
- Katmanlar yazıldı.

![hrms_project](https://user-images.githubusercontent.com/57464067/119282318-e83add00-bc41-11eb-94b4-0ac7710d3007.png)
- Sistemde bulunan genel iş pozisyonlarını listeleyecek api yazıldı.

![ss_basarili](https://user-images.githubusercontent.com/57464067/119282320-eb35cd80-bc41-11eb-8c37-56e9a5525f8b.png)

### 7)northwind-2
swagger implementasyonu için https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api adresine gidelim

3 ve 5.1 kısımlı bağımlılıkları pom.xml'e ekleyelim.

    		<dependency>
    			<groupId>io.springfox</groupId>
    			<artifactId>springfox-swagger2</artifactId>
    			<version>2.9.2</version>
    		</dependency>
    		<dependency>
    			<groupId>io.springfox</groupId>
    			<artifactId>springfox-swagger-ui</artifactId>
    			<version>2.9.2</version>
    		</dependency>
        
sonra 4.1 kısımlı kodu main fonksiyonumuzun altına ekleyelim
    
    @Bean
    	public Docket api() {
    		return new Docket(DocumentationType.SWAGGER_2)
    				.select()
    				.apis(RequestHandlerSelectors.basePackage("kodlamaio.northwind"))
    				.build();
    	}
     
importlarımızı yapmayı unutmayalım
     
en yukarıya @EnableSwagger2 anotasyonumuzu ekleyelim

### swagger-ui.html
![swagger ui html](https://user-images.githubusercontent.com/57464067/126077899-79132216-165c-470b-a23b-5f1c41adb8c3.png)

### /api/products/getall
![product-getall](https://user-images.githubusercontent.com/57464067/126077924-50ca80a7-787f-46ac-8b07-3a94cfa0135b.png)
![product-getall-2](https://user-images.githubusercontent.com/57464067/126077927-19fbbd84-a0f7-4fc7-88ef-6fff1898fc07.png)

### /api/products/add
![products-add](https://user-images.githubusercontent.com/57464067/126077938-a64f4393-2366-4f2d-8dde-83f9d95c0c18.png)
![products-add-2](https://user-images.githubusercontent.com/57464067/126077942-82074528-c31d-4320-a75b-b6790d4a1f89.png)


