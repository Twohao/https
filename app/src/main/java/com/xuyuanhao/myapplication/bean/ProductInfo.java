package com.xuyuanhao.myapplication.bean;

import java.util.List;

/**
 * Created by Mr.xu on 2016/3/8.
 */
public class ProductInfo {


    /**
     * code : 0
     * data : {"products":[{"category_id":37,"current_sku":{"discount":27,"id":10359958,"list_price":{"CNY":63979},"real_price":{"CNY":46704},"stock":199},"fav_count":2,"favorite":false,"id":10359958,"images":[{"h":440,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/ebf6b0bc3064483caa2458b3f7f722da.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/ebf6b0bc3064483caa2458b3f7f722da.jpg","w":440}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"Laduree Face Color Rose Laduree花瓣腮红（3色入）粉芯","product_id":10359958,"rank":2147483647,"review_count":0,"score":8,"sku_id":10359958,"url":"https://mcn.seashellmall.com/product/Laduree-Face-Color-Rose-Laduree%E8%8A%B1%E7%93%A3%E8%85%AE%E7%BA%A2%EF%BC%883%E8%89%B2%E5%85%A5%EF%BC%89%E7%B2%89%E8%8A%AF-p-10359958.html"},{"category_id":32,"current_sku":{"discount":10,"id":10360054,"list_price":{"CNY":21500},"real_price":{"CNY":19350},"stock":139},"fav_count":4,"favorite":false,"id":10360054,"images":[{"h":800,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/e66d645ca5c34558a4d6cd6cef14b978.png?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/e66d645ca5c34558a4d6cd6cef14b978.png","w":800}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"Thermos 膳魔师保温杯（粉色）","product_id":10360054,"rank":999999,"review_count":5,"score":11,"sku_id":10360054,"url":"https://mcn.seashellmall.com/product/Thermos-%E8%86%B3%E9%AD%94%E5%B8%88%E4%BF%9D%E6%B8%A9%E6%9D%AF%EF%BC%88%E7%B2%89%E8%89%B2%EF%BC%89-p-10360054.html"},{"category_id":52,"current_sku":{"discount":30,"id":10360263,"list_price":{"CNY":29800},"real_price":{"CNY":20860},"stock":43},"fav_count":6,"favorite":false,"id":10360263,"images":[{"h":430,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/569bc54855964ffcaf485c294fd1e15f.JPG?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/569bc54855964ffcaf485c294fd1e15f.JPG","w":430}],"like_count":0,"location":"国内现货","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"美国乐家杏仁糖","product_id":10360263,"rank":99,"review_count":3,"score":12,"sku_id":10360263,"url":"https://mcn.seashellmall.com/product/%E7%BE%8E%E5%9B%BD%E4%B9%90%E5%AE%B6%E6%9D%8F%E4%BB%81%E7%B3%96-p-10360263.html"},{"category_id":36,"current_sku":{"discount":27,"id":10360027,"list_price":{"CNY":13579},"real_price":{"CNY":9912},"stock":200},"fav_count":0,"favorite":false,"id":10360027,"images":[{"h":3456,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/7a41ded891fa48f4ada6c71138c1d009.JPG?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/7a41ded891fa48f4ada6c71138c1d009.JPG","w":5016}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"参天 BEAUTEYE 玫瑰 贵妇眼药水","product_id":10360027,"rank":99,"review_count":0,"score":8,"sku_id":10360027,"url":"https://mcn.seashellmall.com/product/%E5%8F%82%E5%A4%A9-BEAUTEYE-%E7%8E%AB%E7%91%B0-%E8%B4%B5%E5%A6%87%E7%9C%BC%E8%8D%AF%E6%B0%B4-p-10360027.html"},{"category_id":6,"current_sku":{"discount":27,"id":10359896,"list_price":{"CNY":28279},"real_price":{"CNY":20643},"stock":200},"fav_count":1,"favorite":false,"id":10359896,"images":[{"h":800,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/de83f4bd10b94723b0c8892704938485.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/de83f4bd10b94723b0c8892704938485.jpg","w":800}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"RMK 玫瑰卸妆膏","product_id":10359896,"rank":99,"review_count":0,"score":8,"sku_id":10359896,"url":"https://mcn.seashellmall.com/product/RMK-%E7%8E%AB%E7%91%B0%E5%8D%B8%E5%A6%86%E8%86%8F-p-10359896.html"},{"category_id":42,"current_sku":{"discount":27,"id":10359961,"list_price":{"CNY":76300},"real_price":{"CNY":55699},"stock":199},"fav_count":1,"favorite":false,"id":10359961,"images":[{"h":3456,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/ea8c3bdcd70648b496b41e3c9d512888.JPG?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/ea8c3bdcd70648b496b41e3c9d512888.JPG","w":4128}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"Laduree Face Powder古典蕾丝散粉（3色入）粉芯（不含盒子） 色号备注","product_id":10359961,"rank":99,"review_count":0,"score":8,"sku_id":10359961,"url":"https://mcn.seashellmall.com/product/Laduree-Face-Powder%E5%8F%A4%E5%85%B8%E8%95%BE%E4%B8%9D%E6%95%A3%E7%B2%89%EF%BC%883%E8%89%B2%E5%85%A5%EF%BC%89%E7%B2%89%E8%8A%AF%EF%BC%88%E4%B8%8D%E5%90%AB%E7%9B%92%E5%AD%90%EF%BC%89-%E8%89%B2%E5%8F%B7%E5%A4%87%E6%B3%A8-p-10359961.html"},{"category_id":6,"current_sku":{"discount":27,"id":10359893,"list_price":{"CNY":17500},"real_price":{"CNY":12775},"stock":198},"fav_count":1,"favorite":false,"id":10359893,"images":[{"h":2208,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/3d1f50c1b880428484fa84c50b2c9670.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/3d1f50c1b880428484fa84c50b2c9670.jpg","w":1242}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"Fancl 无添加 精华修护卸妆液 120ml","product_id":10359893,"rank":15,"review_count":0,"score":8,"sku_id":10359893,"url":"https://mcn.seashellmall.com/product/Fancl-%E6%97%A0%E6%B7%BB%E5%8A%A0-%E7%B2%BE%E5%8D%8E%E4%BF%AE%E6%8A%A4%E5%8D%B8%E5%A6%86%E6%B6%B2-120ml-p-10359893.html"},{"category_id":6,"current_sku":{"discount":27,"id":10359897,"list_price":{"CNY":24499},"real_price":{"CNY":17884},"stock":200},"fav_count":0,"favorite":false,"id":10359897,"images":[{"h":750,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/7d452aa3622b49f7b8a8618fd39350a2.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/7d452aa3622b49f7b8a8618fd39350a2.jpg","w":750}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"DHC 橄榄卸妆油","product_id":10359897,"rank":10,"review_count":0,"score":8,"sku_id":10359897,"url":"https://mcn.seashellmall.com/product/DHC-%E6%A9%84%E6%A6%84%E5%8D%B8%E5%A6%86%E6%B2%B9-p-10359897.html"},{"category_id":33,"current_sku":{"discount":27,"id":10360023,"list_price":{"CNY":12740},"real_price":{"CNY":9300},"stock":200},"fav_count":2,"favorite":false,"id":10360023,"images":[{"h":383,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/964636f7b6c1495583a36dc7a2ee3ba7.png?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/964636f7b6c1495583a36dc7a2ee3ba7.png","w":295}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"狮王 Smile Cosmetique按压式美白去渍牙膏","product_id":10360023,"rank":8,"review_count":0,"score":8,"sku_id":10360023,"url":"https://mcn.seashellmall.com/product/%E7%8B%AE%E7%8E%8B-Smile-Cosmetique%E6%8C%89%E5%8E%8B%E5%BC%8F%E7%BE%8E%E7%99%BD%E5%8E%BB%E6%B8%8D%E7%89%99%E8%86%8F-p-10360023.html"},{"category_id":11,"current_sku":{"discount":27,"id":10359874,"list_price":{"CNY":4480},"real_price":{"CNY":3270},"stock":194},"fav_count":1,"favorite":false,"id":10359874,"images":[{"h":784,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/7ef5408f4d934972bb8b69153139955f.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/7ef5408f4d934972bb8b69153139955f.jpg","w":800}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"LuLuLun 补水大容量面膜 (高滋润度蓝色7片装)","product_id":10359874,"rank":5,"review_count":0,"score":8,"sku_id":10359874,"url":"https://mcn.seashellmall.com/product/LuLuLun-%E8%A1%A5%E6%B0%B4%E5%A4%A7%E5%AE%B9%E9%87%8F%E9%9D%A2%E8%86%9C-%28%E9%AB%98%E6%BB%8B%E6%B6%A6%E5%BA%A6%E8%93%9D%E8%89%B27%E7%89%87%E8%A3%85%29-p-10359874.html"},{"category_id":37,"current_sku":{"discount":27,"id":10359956,"list_price":{"CNY":33179},"real_price":{"CNY":24220},"stock":200},"fav_count":1,"favorite":false,"id":10359956,"images":[{"h":800,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/8df316575daa4c6eb688b187757b1be4.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/8df316575daa4c6eb688b187757b1be4.jpg","w":800}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"Laduree 腮红粉(5色入)","product_id":10359956,"rank":5,"review_count":0,"score":8,"sku_id":10359956,"url":"https://mcn.seashellmall.com/product/Laduree-%E8%85%AE%E7%BA%A2%E7%B2%89%285%E8%89%B2%E5%85%A5%29-p-10359956.html"},{"category_id":37,"current_sku":{"discount":27,"id":10359960,"list_price":{"CNY":30520},"real_price":{"CNY":22279},"stock":200},"fav_count":2,"favorite":false,"id":10359960,"images":[{"h":2482,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/918a80e0b3ba4d53accd62afc6552b5b.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/918a80e0b3ba4d53accd62afc6552b5b.jpg","w":3149}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"Laduree Face Color Rose Laduree花瓣腮红（3色入）盒子","product_id":10359960,"rank":5,"review_count":0,"score":8,"sku_id":10359960,"url":"https://mcn.seashellmall.com/product/Laduree-Face-Color-Rose-Laduree%E8%8A%B1%E7%93%A3%E8%85%AE%E7%BA%A2%EF%BC%883%E8%89%B2%E5%85%A5%EF%BC%89%E7%9B%92%E5%AD%90-p-10359960.html"},{"category_id":20,"current_sku":{"discount":27,"id":10360049,"list_price":{"CNY":4200},"real_price":{"CNY":3066},"stock":200},"fav_count":1,"favorite":false,"id":10360049,"images":[{"h":3456,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/b01b4c34b36f48be89f59606e4c7cec2.JPG?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/b01b4c34b36f48be89f59606e4c7cec2.JPG","w":5040}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"Kao 乐而雅 素肌F系列无护翼敏感肌夜用护翼棉柔卫生巾                       300mm 10片","product_id":10360049,"rank":5,"review_count":0,"score":8,"sku_id":10360049,"url":"https://mcn.seashellmall.com/product/Kao-%E4%B9%90%E8%80%8C%E9%9B%85-%E7%B4%A0%E8%82%8CF%E7%B3%BB%E5%88%97%E6%97%A0%E6%8A%A4%E7%BF%BC%E6%95%8F%E6%84%9F%E8%82%8C%E5%A4%9C%E7%94%A8%E6%8A%A4%E7%BF%BC%E6%A3%89%E6%9F%94%E5%8D%AB%E7%94%9F%E5%B7%BE-----------------------300mm-10%E7%89%87-p-10360049.html"},{"category_id":20,"current_sku":{"discount":27,"id":10360050,"list_price":{"CNY":4200},"real_price":{"CNY":3066},"stock":200},"fav_count":1,"favorite":false,"id":10360050,"images":[{"h":3456,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/ace7d4bc3eed496999d69d8e993003fe.JPG?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/ace7d4bc3eed496999d69d8e993003fe.JPG","w":5016}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"Kao 乐而雅 素肌F系列无护翼敏感肌夜用护翼棉柔卫生巾                       340mm 9片","product_id":10360050,"rank":5,"review_count":0,"score":8,"sku_id":10360050,"url":"https://mcn.seashellmall.com/product/Kao-%E4%B9%90%E8%80%8C%E9%9B%85-%E7%B4%A0%E8%82%8CF%E7%B3%BB%E5%88%97%E6%97%A0%E6%8A%A4%E7%BF%BC%E6%95%8F%E6%84%9F%E8%82%8C%E5%A4%9C%E7%94%A8%E6%8A%A4%E7%BF%BC%E6%A3%89%E6%9F%94%E5%8D%AB%E7%94%9F%E5%B7%BE-----------------------340mm-9%E7%89%87-p-10360050.html"},{"category_id":20,"current_sku":{"discount":27,"id":10360047,"list_price":{"CNY":4480},"real_price":{"CNY":3270},"stock":200},"fav_count":2,"favorite":false,"id":10360047,"images":[{"h":3456,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/7fc90c218aee4b10bab916023b93eb22.JPG?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/7fc90c218aee4b10bab916023b93eb22.JPG","w":4464}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"Kao 乐而雅 素肌F系列无护翼敏感肌日用护翼棉柔卫生巾                       205mm 24片","product_id":10360047,"rank":3,"review_count":0,"score":8,"sku_id":10360047,"url":"https://mcn.seashellmall.com/product/Kao-%E4%B9%90%E8%80%8C%E9%9B%85-%E7%B4%A0%E8%82%8CF%E7%B3%BB%E5%88%97%E6%97%A0%E6%8A%A4%E7%BF%BC%E6%95%8F%E6%84%9F%E8%82%8C%E6%97%A5%E7%94%A8%E6%8A%A4%E7%BF%BC%E6%A3%89%E6%9F%94%E5%8D%AB%E7%94%9F%E5%B7%BE-----------------------205mm-24%E7%89%87-p-10360047.html"},{"category_id":11,"current_sku":{"discount":27,"id":10359865,"list_price":{"CNY":7280},"real_price":{"CNY":5314},"stock":199},"fav_count":1,"favorite":false,"id":10359865,"images":[{"h":255,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/18b44bec64434749bda01cb8983a0914.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/18b44bec64434749bda01cb8983a0914.jpg","w":255}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"Kracie 肌美精超渗透3D面膜 （玻尿酸保湿型）-橙色","product_id":10359865,"rank":3,"review_count":0,"score":8,"sku_id":10359865,"url":"https://mcn.seashellmall.com/product/Kracie-%E8%82%8C%E7%BE%8E%E7%B2%BE%E8%B6%85%E6%B8%97%E9%80%8F3D%E9%9D%A2%E8%86%9C-%EF%BC%88%E7%8E%BB%E5%B0%BF%E9%85%B8%E4%BF%9D%E6%B9%BF%E5%9E%8B%EF%BC%89-%E6%A9%99%E8%89%B2-p-10359865.html"},{"category_id":6,"current_sku":{"discount":27,"id":10360083,"list_price":{"CNY":33040},"real_price":{"CNY":24119},"stock":200},"fav_count":0,"favorite":false,"id":10360083,"images":[{"h":3456,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/71806b3eaf754932905bd3bae5d7d5e3.JPG?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/71806b3eaf754932905bd3bae5d7d5e3.JPG","w":4488}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"Nursery柚子卸妆啫喱 500ml","product_id":10360083,"rank":3,"review_count":0,"score":8,"sku_id":10360083,"url":"https://mcn.seashellmall.com/product/Nursery%E6%9F%9A%E5%AD%90%E5%8D%B8%E5%A6%86%E5%95%AB%E5%96%B1-500ml-p-10360083.html"},{"category_id":37,"current_sku":{"discount":27,"id":10360113,"list_price":{"CNY":27858},"real_price":{"CNY":20336},"stock":200},"fav_count":0,"favorite":false,"id":10360113,"images":[{"h":3456,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/25a9c00a06db40358cb2080f6cc63176.JPG?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/25a9c00a06db40358cb2080f6cc63176.JPG","w":5064}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"Nars 腮红14个色号","product_id":10360113,"rank":3,"review_count":0,"score":8,"sku_id":10360113,"url":"https://mcn.seashellmall.com/product/Nars-%E8%85%AE%E7%BA%A214%E4%B8%AA%E8%89%B2%E5%8F%B7-p-10360113.html"},{"category_id":12,"current_sku":{"discount":0,"id":10360272,"list_price":{"CNY":24600},"real_price":{"CNY":24600},"stock":111},"fav_count":1,"favorite":false,"id":10359900,"images":[{"h":2208,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/aab8aee69adf422c928dbb5870e9ce7e.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/aab8aee69adf422c928dbb5870e9ce7e.jpg","w":1242}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"Albion 奥尔滨 健康水 ","product_id":10359900,"rank":2,"review_count":0,"score":8,"sku_id":10360272,"url":"https://mcn.seashellmall.com/product/Albion-%E5%A5%A5%E5%B0%94%E6%BB%A8-%E5%81%A5%E5%BA%B7%E6%B0%B4--p-10359900.html"},{"category_id":44,"current_sku":{"discount":27,"id":10360034,"list_price":{"CNY":769},"real_price":{"CNY":561},"stock":200},"fav_count":1,"favorite":false,"id":10360034,"images":[{"h":2208,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/384733fbb6c347d19be14107eeec7f1f.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/384733fbb6c347d19be14107eeec7f1f.jpg","w":1242}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"Kose 高丝 Je Laime 超保湿款无硅洗发水/护发素  旅行包装                          (蓝色-氨基酸保湿型）","product_id":10360034,"rank":2,"review_count":0,"score":8,"sku_id":10360034,"url":"https://mcn.seashellmall.com/product/Kose-%E9%AB%98%E4%B8%9D-Je-Laime-%E8%B6%85%E4%BF%9D%E6%B9%BF%E6%AC%BE%E6%97%A0%E7%A1%85%E6%B4%97%E5%8F%91%E6%B0%B4-%E6%8A%A4%E5%8F%91%E7%B4%A0--%E6%97%85%E8%A1%8C%E5%8C%85%E8%A3%85--------------------------%28%E8%93%9D%E8%89%B2-%E6%B0%A8%E5%9F%BA%E9%85%B8%E4%BF%9D%E6%B9%BF%E5%9E%8B%EF%BC%89-p-10360034.html"}]}
     * success : true
     */

    private int code;
    private DataEntity data;
    private boolean success;

    public void setCode(int code) {
        this.code = code;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public DataEntity getData() {
        return data;
    }

    public boolean isSuccess() {
        return success;
    }

    public static class DataEntity {
        /**
         * category_id : 37
         * current_sku : {"discount":27,"id":10359958,"list_price":{"CNY":63979},"real_price":{"CNY":46704},"stock":199}
         * fav_count : 2
         * favorite : false
         * id : 10359958
         * images : [{"h":440,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/ebf6b0bc3064483caa2458b3f7f722da.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/ebf6b0bc3064483caa2458b3f7f722da.jpg","w":440}]
         * like_count : 0
         * location : 日本
         * merchant : {"id":84843049,"name":"海呗自营","score":8}
         * merchant_id : 84843049
         * name : Laduree Face Color Rose Laduree花瓣腮红（3色入）粉芯
         * product_id : 10359958
         * rank : 2147483647
         * review_count : 0
         * score : 8
         * sku_id : 10359958
         * url : https://mcn.seashellmall.com/product/Laduree-Face-Color-Rose-Laduree%E8%8A%B1%E7%93%A3%E8%85%AE%E7%BA%A2%EF%BC%883%E8%89%B2%E5%85%A5%EF%BC%89%E7%B2%89%E8%8A%AF-p-10359958.html
         */

        private List<ProductsEntity> products;

        public void setProducts(List<ProductsEntity> products) {
            this.products = products;
        }

        public List<ProductsEntity> getProducts() {
            return products;
        }

        public static class ProductsEntity {
            private int category_id;
            /**
             * discount : 27
             * id : 10359958
             * list_price : {"CNY":63979}
             * real_price : {"CNY":46704}
             * stock : 199
             */

            private CurrentSkuEntity current_sku;
            private int fav_count;
            private boolean favorite;
            private int id;
            private int like_count;
            private String location;
            /**
             * id : 84843049
             * name : 海呗自营
             * score : 8
             */

            private MerchantEntity merchant;
            private int merchant_id;
            private String name;
            private int product_id;
            private int rank;
            private int review_count;
            private int score;
            private int sku_id;
            private String url;
            /**
             * h : 440
             * t_h : 256
             * t_w : 256
             * thumb : http://ec-img.ufile.ucloud.cn/ebf6b0bc3064483caa2458b3f7f722da.jpg?iopcmd=thumbnail&type=8&width=256&height=256
             * url : http://ec-img.ufile.ucloud.cn/ebf6b0bc3064483caa2458b3f7f722da.jpg
             * w : 440
             */

            private List<ImagesEntity> images;

            public void setCategory_id(int category_id) {
                this.category_id = category_id;
            }

            public void setCurrent_sku(CurrentSkuEntity current_sku) {
                this.current_sku = current_sku;
            }

            public void setFav_count(int fav_count) {
                this.fav_count = fav_count;
            }

            public void setFavorite(boolean favorite) {
                this.favorite = favorite;
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setLike_count(int like_count) {
                this.like_count = like_count;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public void setMerchant(MerchantEntity merchant) {
                this.merchant = merchant;
            }

            public void setMerchant_id(int merchant_id) {
                this.merchant_id = merchant_id;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setProduct_id(int product_id) {
                this.product_id = product_id;
            }

            public void setRank(int rank) {
                this.rank = rank;
            }

            public void setReview_count(int review_count) {
                this.review_count = review_count;
            }

            public void setScore(int score) {
                this.score = score;
            }

            public void setSku_id(int sku_id) {
                this.sku_id = sku_id;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public void setImages(List<ImagesEntity> images) {
                this.images = images;
            }

            public int getCategory_id() {
                return category_id;
            }

            public CurrentSkuEntity getCurrent_sku() {
                return current_sku;
            }

            public int getFav_count() {
                return fav_count;
            }

            public boolean isFavorite() {
                return favorite;
            }

            public int getId() {
                return id;
            }

            public int getLike_count() {
                return like_count;
            }

            public String getLocation() {
                return location;
            }

            public MerchantEntity getMerchant() {
                return merchant;
            }

            public int getMerchant_id() {
                return merchant_id;
            }

            public String getName() {
                return name;
            }

            public int getProduct_id() {
                return product_id;
            }

            public int getRank() {
                return rank;
            }

            public int getReview_count() {
                return review_count;
            }

            public int getScore() {
                return score;
            }

            public int getSku_id() {
                return sku_id;
            }

            public String getUrl() {
                return url;
            }

            public List<ImagesEntity> getImages() {
                return images;
            }

            public static class CurrentSkuEntity {
                private int discount;
                private int id;
                /**
                 * CNY : 63979
                 */

                private ListPriceEntity list_price;
                /**
                 * CNY : 46704
                 */

                private RealPriceEntity real_price;
                private int stock;

                public void setDiscount(int discount) {
                    this.discount = discount;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public void setList_price(ListPriceEntity list_price) {
                    this.list_price = list_price;
                }

                public void setReal_price(RealPriceEntity real_price) {
                    this.real_price = real_price;
                }

                public void setStock(int stock) {
                    this.stock = stock;
                }

                public int getDiscount() {
                    return discount;
                }

                public int getId() {
                    return id;
                }

                public ListPriceEntity getList_price() {
                    return list_price;
                }

                public RealPriceEntity getReal_price() {
                    return real_price;
                }

                public int getStock() {
                    return stock;
                }

                public static class ListPriceEntity {
                    private int CNY;

                    public void setCNY(int CNY) {
                        this.CNY = CNY;
                    }

                    public int getCNY() {
                        return CNY;
                    }
                }

                public static class RealPriceEntity {
                    private int CNY;

                    public void setCNY(int CNY) {
                        this.CNY = CNY;
                    }

                    public int getCNY() {
                        return CNY;
                    }
                }
            }

            public static class MerchantEntity {
                private int id;
                private String name;
                private int score;

                public void setId(int id) {
                    this.id = id;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public void setScore(int score) {
                    this.score = score;
                }

                public int getId() {
                    return id;
                }

                public String getName() {
                    return name;
                }

                public int getScore() {
                    return score;
                }
            }

            public static class ImagesEntity {
                private int h;
                private int t_h;
                private int t_w;
                private String thumb;
                private String url;
                private int w;

                public void setH(int h) {
                    this.h = h;
                }

                public void setT_h(int t_h) {
                    this.t_h = t_h;
                }

                public void setT_w(int t_w) {
                    this.t_w = t_w;
                }

                public void setThumb(String thumb) {
                    this.thumb = thumb;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setW(int w) {
                    this.w = w;
                }

                public int getH() {
                    return h;
                }

                public int getT_h() {
                    return t_h;
                }

                public int getT_w() {
                    return t_w;
                }

                public String getThumb() {
                    return thumb;
                }

                public String getUrl() {
                    return url;
                }

                public int getW() {
                    return w;
                }
            }
        }
    }
}
