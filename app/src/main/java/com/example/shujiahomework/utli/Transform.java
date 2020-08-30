package com.example.shujiahomework.utli;

import com.example.shujiahomework.bean.License;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class Transform {

    public static String transformintoCity(String license) {
        String response ="[\n" +
                "    {\n" +
                "        \"code\": \"冀A\",\n" +
                "        \"city\": \"石家庄\",\n" +
                "        \"province\": \"河北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"冀B\",\n" +
                "        \"city\": \"唐山\",\n" +
                "        \"province\": \"河北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"冀C\",\n" +
                "        \"city\": \"秦皇岛\",\n" +
                "        \"province\": \"河北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"冀D\",\n" +
                "        \"city\": \"邯郸\",\n" +
                "        \"province\": \"河北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"冀E\",\n" +
                "        \"city\": \"邢台\",\n" +
                "        \"province\": \"河北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"冀F\",\n" +
                "        \"city\": \"保定\",\n" +
                "        \"province\": \"河北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"冀G\",\n" +
                "        \"city\": \"张家口\",\n" +
                "        \"province\": \"河北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"冀H\",\n" +
                "        \"city\": \"承德\",\n" +
                "        \"province\": \"河北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"冀J\",\n" +
                "        \"city\": \"沧州\",\n" +
                "        \"province\": \"河北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"冀R\",\n" +
                "        \"city\": \"廊坊\",\n" +
                "        \"province\": \"河北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"冀S\",\n" +
                "        \"city\": \"沧州\",\n" +
                "        \"province\": \"河北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"冀T\",\n" +
                "        \"city\": \"衡水\",\n" +
                "        \"province\": \"河北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"辽A\",\n" +
                "        \"city\": \"沈阳\",\n" +
                "        \"province\": \"辽宁\",\n" +
                "        \"Pcode\": \"LN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"辽B\",\n" +
                "        \"city\": \"大连\",\n" +
                "        \"province\": \"辽宁\",\n" +
                "        \"Pcode\": \"LN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"辽C\",\n" +
                "        \"city\": \"鞍山\",\n" +
                "        \"province\": \"辽宁\",\n" +
                "        \"Pcode\": \"LN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"辽D\",\n" +
                "        \"city\": \"抚顺\",\n" +
                "        \"province\": \"辽宁\",\n" +
                "        \"Pcode\": \"LN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"辽E\",\n" +
                "        \"city\": \"本溪\",\n" +
                "        \"province\": \"辽宁\",\n" +
                "        \"Pcode\": \"LN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"辽F\",\n" +
                "        \"city\": \"丹东\",\n" +
                "        \"province\": \"辽宁\",\n" +
                "        \"Pcode\": \"LN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"辽G\",\n" +
                "        \"city\": \"锦州\",\n" +
                "        \"province\": \"辽宁\",\n" +
                "        \"Pcode\": \"LN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"辽H\",\n" +
                "        \"city\": \"营口\",\n" +
                "        \"province\": \"辽宁\",\n" +
                "        \"Pcode\": \"LN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"辽J\",\n" +
                "        \"city\": \"阜新\",\n" +
                "        \"province\": \"辽宁\",\n" +
                "        \"Pcode\": \"LN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"辽K\",\n" +
                "        \"city\": \"辽阳\",\n" +
                "        \"province\": \"辽宁\",\n" +
                "        \"Pcode\": \"LN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"辽L\",\n" +
                "        \"city\": \"盘锦\",\n" +
                "        \"province\": \"辽宁\",\n" +
                "        \"Pcode\": \"LN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"辽M\",\n" +
                "        \"city\": \"铁岭\",\n" +
                "        \"province\": \"辽宁\",\n" +
                "        \"Pcode\": \"LN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"辽N\",\n" +
                "        \"city\": \"朝阳\",\n" +
                "        \"province\": \"辽宁\",\n" +
                "        \"Pcode\": \"LN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"辽P\",\n" +
                "        \"city\": \"葫芦岛\",\n" +
                "        \"province\": \"辽宁\",\n" +
                "        \"Pcode\": \"LN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"皖A\",\n" +
                "        \"city\": \"合肥\",\n" +
                "        \"province\": \"安徽\",\n" +
                "        \"Pcode\": \"AH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"皖B\",\n" +
                "        \"city\": \"芜湖\",\n" +
                "        \"province\": \"安徽\",\n" +
                "        \"Pcode\": \"AH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"皖C\",\n" +
                "        \"city\": \"蚌埠\",\n" +
                "        \"province\": \"安徽\",\n" +
                "        \"Pcode\": \"AH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"皖D\",\n" +
                "        \"city\": \"淮南\",\n" +
                "        \"province\": \"安徽\",\n" +
                "        \"Pcode\": \"AH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"皖E\",\n" +
                "        \"city\": \"马鞍山\",\n" +
                "        \"province\": \"安徽\",\n" +
                "        \"Pcode\": \"AH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"皖F\",\n" +
                "        \"city\": \"淮北\",\n" +
                "        \"province\": \"安徽\",\n" +
                "        \"Pcode\": \"AH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"皖G\",\n" +
                "        \"city\": \"铜陵\",\n" +
                "        \"province\": \"安徽\",\n" +
                "        \"Pcode\": \"AH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"皖H\",\n" +
                "        \"city\": \"安庆\",\n" +
                "        \"province\": \"安徽\",\n" +
                "        \"Pcode\": \"AH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"皖J\",\n" +
                "        \"city\": \"黄山\",\n" +
                "        \"province\": \"安徽\",\n" +
                "        \"Pcode\": \"AH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"皖K\",\n" +
                "        \"city\": \"阜阳\",\n" +
                "        \"province\": \"安徽\",\n" +
                "        \"Pcode\": \"AH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"皖L\",\n" +
                "        \"city\": \"宿州\",\n" +
                "        \"province\": \"安徽\",\n" +
                "        \"Pcode\": \"AH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"皖M\",\n" +
                "        \"city\": \"滁州\",\n" +
                "        \"province\": \"安徽\",\n" +
                "        \"Pcode\": \"AH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"皖N\",\n" +
                "        \"city\": \"六安\",\n" +
                "        \"province\": \"安徽\",\n" +
                "        \"Pcode\": \"AH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"皖P\",\n" +
                "        \"city\": \"宣城\",\n" +
                "        \"province\": \"安徽\",\n" +
                "        \"Pcode\": \"AH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"皖Q\",\n" +
                "        \"city\": \"巢湖\",\n" +
                "        \"province\": \"安徽\",\n" +
                "        \"Pcode\": \"AH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"皖R\",\n" +
                "        \"city\": \"池州\",\n" +
                "        \"province\": \"安徽\",\n" +
                "        \"Pcode\": \"AH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"皖S\",\n" +
                "        \"city\": \"亳州\",\n" +
                "        \"province\": \"安徽\",\n" +
                "        \"Pcode\": \"AH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"苏A\",\n" +
                "        \"city\": \"南京\",\n" +
                "        \"province\": \"江苏\",\n" +
                "        \"Pcode\": \"JS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"苏B\",\n" +
                "        \"city\": \"无锡\",\n" +
                "        \"province\": \"江苏\",\n" +
                "        \"Pcode\": \"JS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"苏C\",\n" +
                "        \"city\": \"徐州\",\n" +
                "        \"province\": \"江苏\",\n" +
                "        \"Pcode\": \"JS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"苏D\",\n" +
                "        \"city\": \"常州\",\n" +
                "        \"province\": \"江苏\",\n" +
                "        \"Pcode\": \"JS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"苏E\",\n" +
                "        \"city\": \"苏州\",\n" +
                "        \"province\": \"江苏\",\n" +
                "        \"Pcode\": \"JS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"苏F\",\n" +
                "        \"city\": \"南通\",\n" +
                "        \"province\": \"江苏\",\n" +
                "        \"Pcode\": \"JS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"苏G\",\n" +
                "        \"city\": \"连云港\",\n" +
                "        \"province\": \"江苏\",\n" +
                "        \"Pcode\": \"JS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"苏H\",\n" +
                "        \"city\": \"淮安\",\n" +
                "        \"province\": \"江苏\",\n" +
                "        \"Pcode\": \"JS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"苏J\",\n" +
                "        \"city\": \"盐城\",\n" +
                "        \"province\": \"江苏\",\n" +
                "        \"Pcode\": \"JS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"苏K\",\n" +
                "        \"city\": \"扬州\",\n" +
                "        \"province\": \"江苏\",\n" +
                "        \"Pcode\": \"JS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"苏L\",\n" +
                "        \"city\": \"镇江\",\n" +
                "        \"province\": \"江苏\",\n" +
                "        \"Pcode\": \"JS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"苏M\",\n" +
                "        \"city\": \"泰州\",\n" +
                "        \"province\": \"江苏\",\n" +
                "        \"Pcode\": \"JS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"苏N\",\n" +
                "        \"city\": \"宿迁\",\n" +
                "        \"province\": \"江苏\",\n" +
                "        \"Pcode\": \"JS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鄂A\",\n" +
                "        \"city\": \"武汉\",\n" +
                "        \"province\": \"湖北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鄂B\",\n" +
                "        \"city\": \"黄石\",\n" +
                "        \"province\": \"湖北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鄂C\",\n" +
                "        \"city\": \"十堰\",\n" +
                "        \"province\": \"湖北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鄂D\",\n" +
                "        \"city\": \"荆州\",\n" +
                "        \"province\": \"湖北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鄂E\",\n" +
                "        \"city\": \"宜昌\",\n" +
                "        \"province\": \"湖北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鄂F\",\n" +
                "        \"city\": \"襄樊\",\n" +
                "        \"province\": \"湖北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鄂G\",\n" +
                "        \"city\": \"鄂州\",\n" +
                "        \"province\": \"湖北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鄂H\",\n" +
                "        \"city\": \"荆门 \",\n" +
                "        \"province\": \"湖北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鄂J\",\n" +
                "        \"city\": \"黄冈\",\n" +
                "        \"province\": \"湖北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鄂K\",\n" +
                "        \"city\": \"孝感\",\n" +
                "        \"province\": \"湖北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鄂L\",\n" +
                "        \"city\": \"咸宁\",\n" +
                "        \"province\": \"湖北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鄂M\",\n" +
                "        \"city\": \"仙桃\",\n" +
                "        \"province\": \"湖北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鄂N\",\n" +
                "        \"city\": \"潜江\",\n" +
                "        \"province\": \"湖北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鄂P\",\n" +
                "        \"city\": \"神农架林区\",\n" +
                "        \"province\": \"湖北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鄂Q\",\n" +
                "        \"city\": \"恩施土家族苗族自治州\",\n" +
                "        \"province\": \"湖北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鄂R\",\n" +
                "        \"city\": \"天门\",\n" +
                "        \"province\": \"湖北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鄂S\",\n" +
                "        \"city\": \"随州\",\n" +
                "        \"province\": \"湖北\",\n" +
                "        \"Pcode\": \"HB\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"晋A\",\n" +
                "        \"city\": \"太原\",\n" +
                "        \"province\": \"山西\",\n" +
                "        \"Pcode\": \"SX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"晋B\",\n" +
                "        \"city\": \"大同\",\n" +
                "        \"province\": \"山西\",\n" +
                "        \"Pcode\": \"SX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"晋C\",\n" +
                "        \"city\": \"阳泉\",\n" +
                "        \"province\": \"山西\",\n" +
                "        \"Pcode\": \"SX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"晋D\",\n" +
                "        \"city\": \"长治\",\n" +
                "        \"province\": \"山西\",\n" +
                "        \"Pcode\": \"SX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"晋E\",\n" +
                "        \"city\": \"晋城\",\n" +
                "        \"province\": \"山西\",\n" +
                "        \"Pcode\": \"SX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"晋F\",\n" +
                "        \"city\": \"朔州\",\n" +
                "        \"province\": \"山西\",\n" +
                "        \"Pcode\": \"SX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"晋H\",\n" +
                "        \"city\": \"忻州\",\n" +
                "        \"province\": \"山西\",\n" +
                "        \"Pcode\": \"SX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"晋J\",\n" +
                "        \"city\": \"吕梁地区\",\n" +
                "        \"province\": \"山西\",\n" +
                "        \"Pcode\": \"SX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"晋K\",\n" +
                "        \"city\": \"晋中\",\n" +
                "        \"province\": \"山西\",\n" +
                "        \"Pcode\": \"SX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"晋L\",\n" +
                "        \"city\": \"临汾\",\n" +
                "        \"province\": \"山西\",\n" +
                "        \"Pcode\": \"SX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"晋M\",\n" +
                "        \"city\": \"运城\",\n" +
                "        \"province\": \"山西\",\n" +
                "        \"Pcode\": \"SX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"吉A\",\n" +
                "        \"city\": \"长春\",\n" +
                "        \"province\": \"吉林\",\n" +
                "        \"Pcode\": \"JL\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"吉B\",\n" +
                "        \"city\": \"吉林\",\n" +
                "        \"province\": \"吉林\",\n" +
                "        \"Pcode\": \"JL\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"吉C\",\n" +
                "        \"city\": \"四平\",\n" +
                "        \"province\": \"吉林\",\n" +
                "        \"Pcode\": \"JL\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"吉D\",\n" +
                "        \"city\": \"辽源\",\n" +
                "        \"province\": \"吉林\",\n" +
                "        \"Pcode\": \"JL\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"吉E\",\n" +
                "        \"city\": \"通化\",\n" +
                "        \"province\": \"吉林\",\n" +
                "        \"Pcode\": \"JL\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"吉F\",\n" +
                "        \"city\": \"白山\",\n" +
                "        \"province\": \"吉林\",\n" +
                "        \"Pcode\": \"JL\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"吉G\",\n" +
                "        \"city\": \"白城\",\n" +
                "        \"province\": \"吉林\",\n" +
                "        \"Pcode\": \"JL\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"吉H\",\n" +
                "        \"city\": \"延边朝鲜族自治州\",\n" +
                "        \"province\": \"吉林\",\n" +
                "        \"Pcode\": \"JL\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"吉J\",\n" +
                "        \"city\": \"松原\",\n" +
                "        \"province\": \"吉林\",\n" +
                "        \"Pcode\": \"JL\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"吉K\",\n" +
                "        \"city\": \"长白山\",\n" +
                "        \"province\": \"吉林\",\n" +
                "        \"Pcode\": \"JL\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"粤A\",\n" +
                "        \"city\": \"广州\",\n" +
                "        \"province\": \"广东\",\n" +
                "        \"Pcode\": \"GD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"粤B\",\n" +
                "        \"city\": \"深圳\",\n" +
                "        \"province\": \"广东\",\n" +
                "        \"Pcode\": \"GD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"粤C\",\n" +
                "        \"city\": \"珠海\",\n" +
                "        \"province\": \"广东\",\n" +
                "        \"Pcode\": \"GD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"粤D\",\n" +
                "        \"city\": \"汕头\",\n" +
                "        \"province\": \"广东\",\n" +
                "        \"Pcode\": \"GD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"粤E\",\n" +
                "        \"city\": \"佛山\",\n" +
                "        \"province\": \"广东\",\n" +
                "        \"Pcode\": \"GD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"粤F\",\n" +
                "        \"city\": \"韶关\",\n" +
                "        \"province\": \"广东\",\n" +
                "        \"Pcode\": \"GD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"粤G\",\n" +
                "        \"city\": \"湛江\",\n" +
                "        \"province\": \"广东\",\n" +
                "        \"Pcode\": \"GD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"粤H\",\n" +
                "        \"city\": \"肇庆\",\n" +
                "        \"province\": \"广东\",\n" +
                "        \"Pcode\": \"GD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"粤J\",\n" +
                "        \"city\": \"江门\",\n" +
                "        \"province\": \"广东\",\n" +
                "        \"Pcode\": \"GD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"粤K\",\n" +
                "        \"city\": \"茂名\",\n" +
                "        \"province\": \"广东\",\n" +
                "        \"Pcode\": \"GD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"粤L\",\n" +
                "        \"city\": \"惠州\",\n" +
                "        \"province\": \"广东\",\n" +
                "        \"Pcode\": \"GD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"粤M\",\n" +
                "        \"city\": \"梅州\",\n" +
                "        \"province\": \"广东\",\n" +
                "        \"Pcode\": \"GD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"粤N\",\n" +
                "        \"city\": \"汕尾\",\n" +
                "        \"province\": \"广东\",\n" +
                "        \"Pcode\": \"GD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"粤P\",\n" +
                "        \"city\": \"河源\",\n" +
                "        \"province\": \"广东\",\n" +
                "        \"Pcode\": \"GD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"粤Q\",\n" +
                "        \"city\": \"阳江\",\n" +
                "        \"province\": \"广东\",\n" +
                "        \"Pcode\": \"GD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"粤R\",\n" +
                "        \"city\": \"清远\",\n" +
                "        \"province\": \"广东\",\n" +
                "        \"Pcode\": \"GD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"粤S\",\n" +
                "        \"city\": \"东莞\",\n" +
                "        \"province\": \"广东\",\n" +
                "        \"Pcode\": \"GD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"粤T\",\n" +
                "        \"city\": \"中山\",\n" +
                "        \"province\": \"广东\",\n" +
                "        \"Pcode\": \"GD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"粤U\",\n" +
                "        \"city\": \"潮州\",\n" +
                "        \"province\": \"广东\",\n" +
                "        \"Pcode\": \"GD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"粤V\",\n" +
                "        \"city\": \"揭阳\",\n" +
                "        \"province\": \"广东\",\n" +
                "        \"Pcode\": \"GD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"粤W\",\n" +
                "        \"city\": \"云浮\",\n" +
                "        \"province\": \"广东\",\n" +
                "        \"Pcode\": \"GD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"粤X\",\n" +
                "        \"city\": \"顺德区\",\n" +
                "        \"province\": \"广东\",\n" +
                "        \"Pcode\": \"GD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"粤Y\",\n" +
                "        \"city\": \"南海区\",\n" +
                "        \"province\": \"广东\",\n" +
                "        \"Pcode\": \"GD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"粤Z\",\n" +
                "        \"city\": \"港澳进入内地车辆\",\n" +
                "        \"province\": \"广东\",\n" +
                "        \"Pcode\": \"GD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"宁A\",\n" +
                "        \"city\": \"银川\",\n" +
                "        \"province\": \"宁夏\",\n" +
                "        \"Pcode\": \"NX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"宁B\",\n" +
                "        \"city\": \"石嘴山\",\n" +
                "        \"province\": \"宁夏\",\n" +
                "        \"Pcode\": \"NX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"宁C\",\n" +
                "        \"city\": \"银南\",\n" +
                "        \"province\": \"宁夏\",\n" +
                "        \"Pcode\": \"NX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"宁D\",\n" +
                "        \"city\": \"固原\",\n" +
                "        \"province\": \"宁夏\",\n" +
                "        \"Pcode\": \"NX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"宁E\",\n" +
                "        \"city\": \"中卫\",\n" +
                "        \"province\": \"宁夏\",\n" +
                "        \"Pcode\": \"NX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"京A\",\n" +
                "        \"city\": \"北京\",\n" +
                "        \"province\": \"北京\",\n" +
                "        \"Pcode\": \"BJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"京B\",\n" +
                "        \"city\": \"北京\",\n" +
                "        \"province\": \"北京\",\n" +
                "        \"Pcode\": \"BJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"京C\",\n" +
                "        \"city\": \"北京\",\n" +
                "        \"province\": \"北京\",\n" +
                "        \"Pcode\": \"BJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"京D\",\n" +
                "        \"city\": \"北京\",\n" +
                "        \"province\": \"北京\",\n" +
                "        \"Pcode\": \"BJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"京E\",\n" +
                "        \"city\": \"北京\",\n" +
                "        \"province\": \"北京\",\n" +
                "        \"Pcode\": \"BJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"京F\",\n" +
                "        \"city\": \"北京\",\n" +
                "        \"province\": \"北京\",\n" +
                "        \"Pcode\": \"BJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"京G\",\n" +
                "        \"city\": \"北京\",\n" +
                "        \"province\": \"北京\",\n" +
                "        \"Pcode\": \"BJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"京H\",\n" +
                "        \"city\": \"北京\",\n" +
                "        \"province\": \"北京\",\n" +
                "        \"Pcode\": \"BJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"京J\",\n" +
                "        \"city\": \"北京\",\n" +
                "        \"province\": \"北京\",\n" +
                "        \"Pcode\": \"BJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"京K\",\n" +
                "        \"city\": \"北京\",\n" +
                "        \"province\": \"北京\",\n" +
                "        \"Pcode\": \"BJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"京L\",\n" +
                "        \"city\": \"北京\",\n" +
                "        \"province\": \"北京\",\n" +
                "        \"Pcode\": \"BJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"京M\",\n" +
                "        \"city\": \"北京\",\n" +
                "        \"province\": \"北京\",\n" +
                "        \"Pcode\": \"BJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"京Y\",\n" +
                "        \"city\": \"北京\",\n" +
                "        \"province\": \"北京\",\n" +
                "        \"Pcode\": \"BJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"豫A\",\n" +
                "        \"city\": \"郑州\",\n" +
                "        \"province\": \"河南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"豫B\",\n" +
                "        \"city\": \"开封\",\n" +
                "        \"province\": \"河南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"豫C\",\n" +
                "        \"city\": \"洛阳\",\n" +
                "        \"province\": \"河南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"豫D\",\n" +
                "        \"city\": \"平顶山\",\n" +
                "        \"province\": \"河南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"豫E\",\n" +
                "        \"city\": \"安阳\",\n" +
                "        \"province\": \"河南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"豫F\",\n" +
                "        \"city\": \"鹤壁\",\n" +
                "        \"province\": \"河南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"豫G\",\n" +
                "        \"city\": \"新乡\",\n" +
                "        \"province\": \"河南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"豫H\",\n" +
                "        \"city\": \"焦作\",\n" +
                "        \"province\": \"河南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"豫J\",\n" +
                "        \"city\": \"濮阳\",\n" +
                "        \"province\": \"河南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"豫K\",\n" +
                "        \"city\": \"许昌\",\n" +
                "        \"province\": \"河南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"豫L\",\n" +
                "        \"city\": \"漯河\",\n" +
                "        \"province\": \"河南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"豫M\",\n" +
                "        \"city\": \"三门峡\",\n" +
                "        \"province\": \"河南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"豫N\",\n" +
                "        \"city\": \"商丘\",\n" +
                "        \"province\": \"河南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"豫P\",\n" +
                "        \"city\": \"周口\",\n" +
                "        \"province\": \"河南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"豫Q\",\n" +
                "        \"city\": \"驻马店\",\n" +
                "        \"province\": \"河南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"豫R\",\n" +
                "        \"city\": \"南阳\",\n" +
                "        \"province\": \"河南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"豫S\",\n" +
                "        \"city\": \"信阳\",\n" +
                "        \"province\": \"河南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"豫U\",\n" +
                "        \"city\": \"济源\",\n" +
                "        \"province\": \"河南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"黑A\",\n" +
                "        \"city\": \"哈尔滨\",\n" +
                "        \"province\": \"黑龙江\",\n" +
                "        \"Pcode\": \"HLJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"黑B\",\n" +
                "        \"city\": \"齐齐哈尔\",\n" +
                "        \"province\": \"黑龙江\",\n" +
                "        \"Pcode\": \"HLJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"黑C\",\n" +
                "        \"city\": \"牡丹江\",\n" +
                "        \"province\": \"黑龙江\",\n" +
                "        \"Pcode\": \"HLJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"黑D\",\n" +
                "        \"city\": \"佳木斯\",\n" +
                "        \"province\": \"黑龙江\",\n" +
                "        \"Pcode\": \"HLJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"黑E\",\n" +
                "        \"city\": \"大庆\",\n" +
                "        \"province\": \"黑龙江\",\n" +
                "        \"Pcode\": \"HLJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"黑F\",\n" +
                "        \"city\": \"伊春\",\n" +
                "        \"province\": \"黑龙江\",\n" +
                "        \"Pcode\": \"HLJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"黑G\",\n" +
                "        \"city\": \"鸡西\",\n" +
                "        \"province\": \"黑龙江\",\n" +
                "        \"Pcode\": \"HLJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"黑H\",\n" +
                "        \"city\": \"鹤岗\",\n" +
                "        \"province\": \"黑龙江\",\n" +
                "        \"Pcode\": \"HLJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"黑J\",\n" +
                "        \"city\": \"双鸭山\",\n" +
                "        \"province\": \"黑龙江\",\n" +
                "        \"Pcode\": \"HLJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"黑K\",\n" +
                "        \"city\": \"七台河\",\n" +
                "        \"province\": \"黑龙江\",\n" +
                "        \"Pcode\": \"HLJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"黑L\",\n" +
                "        \"city\": \"松花江地区\",\n" +
                "        \"province\": \"黑龙江\",\n" +
                "        \"Pcode\": \"HLJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"黑M\",\n" +
                "        \"city\": \"绥化\",\n" +
                "        \"province\": \"黑龙江\",\n" +
                "        \"Pcode\": \"HLJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"黑N\",\n" +
                "        \"city\": \"黑河\",\n" +
                "        \"province\": \"黑龙江\",\n" +
                "        \"Pcode\": \"HLJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"黑P\",\n" +
                "        \"city\": \"大兴安岭地区\",\n" +
                "        \"province\": \"黑龙江\",\n" +
                "        \"Pcode\": \"HLJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"黑R\",\n" +
                "        \"city\": \"农垦系统\",\n" +
                "        \"province\": \"黑龙江\",\n" +
                "        \"Pcode\": \"HLJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鲁A \",\n" +
                "        \"city\": \"济南\",\n" +
                "        \"province\": \"山东\",\n" +
                "        \"Pcode\": \"SD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鲁B\",\n" +
                "        \"city\": \"青岛\",\n" +
                "        \"province\": \"山东\",\n" +
                "        \"Pcode\": \"SD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鲁C\",\n" +
                "        \"city\": \"淄博\",\n" +
                "        \"province\": \"山东\",\n" +
                "        \"Pcode\": \"SD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鲁D\",\n" +
                "        \"city\": \"枣庄\",\n" +
                "        \"province\": \"山东\",\n" +
                "        \"Pcode\": \"SD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鲁E\",\n" +
                "        \"city\": \"东营\",\n" +
                "        \"province\": \"山东\",\n" +
                "        \"Pcode\": \"SD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鲁F\",\n" +
                "        \"city\": \"烟台\",\n" +
                "        \"province\": \"山东\",\n" +
                "        \"Pcode\": \"SD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鲁G\",\n" +
                "        \"city\": \"潍坊\",\n" +
                "        \"province\": \"山东\",\n" +
                "        \"Pcode\": \"SD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鲁H\",\n" +
                "        \"city\": \"济宁\",\n" +
                "        \"province\": \"山东\",\n" +
                "        \"Pcode\": \"SD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鲁J\",\n" +
                "        \"city\": \"泰安\",\n" +
                "        \"province\": \"山东\",\n" +
                "        \"Pcode\": \"SD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鲁K\",\n" +
                "        \"city\": \"威海\",\n" +
                "        \"province\": \"山东\",\n" +
                "        \"Pcode\": \"SD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鲁L\",\n" +
                "        \"city\": \"日照\",\n" +
                "        \"province\": \"山东\",\n" +
                "        \"Pcode\": \"SD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鲁M\",\n" +
                "        \"city\": \"滨州\",\n" +
                "        \"province\": \"山东\",\n" +
                "        \"Pcode\": \"SD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鲁N\",\n" +
                "        \"city\": \"德州\",\n" +
                "        \"province\": \"山东\",\n" +
                "        \"Pcode\": \"SD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鲁P\",\n" +
                "        \"city\": \"聊城\",\n" +
                "        \"province\": \"山东\",\n" +
                "        \"Pcode\": \"SD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鲁Q\",\n" +
                "        \"city\": \"临沂\",\n" +
                "        \"province\": \"山东\",\n" +
                "        \"Pcode\": \"SD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鲁R\",\n" +
                "        \"city\": \"菏泽\",\n" +
                "        \"province\": \"山东\",\n" +
                "        \"Pcode\": \"SD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鲁S\",\n" +
                "        \"city\": \"莱芜\",\n" +
                "        \"province\": \"山东\",\n" +
                "        \"Pcode\": \"SD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鲁U\",\n" +
                "        \"city\": \"青岛增补\",\n" +
                "        \"province\": \"山东\",\n" +
                "        \"Pcode\": \"SD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鲁V\",\n" +
                "        \"city\": \"潍坊增补\",\n" +
                "        \"province\": \"山东\",\n" +
                "        \"Pcode\": \"SD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"鲁Y\",\n" +
                "        \"city\": \"烟台\",\n" +
                "        \"province\": \"山东\",\n" +
                "        \"Pcode\": \"SD\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"浙A\",\n" +
                "        \"city\": \"杭州\",\n" +
                "        \"province\": \"浙江\",\n" +
                "        \"Pcode\": \"ZJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"浙B\",\n" +
                "        \"city\": \"宁波\",\n" +
                "        \"province\": \"浙江\",\n" +
                "        \"Pcode\": \"ZJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"浙C\",\n" +
                "        \"city\": \"温州\",\n" +
                "        \"province\": \"浙江\",\n" +
                "        \"Pcode\": \"ZJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"浙D\",\n" +
                "        \"city\": \"绍兴\",\n" +
                "        \"province\": \"浙江\",\n" +
                "        \"Pcode\": \"ZJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"浙E\",\n" +
                "        \"city\": \"湖州\",\n" +
                "        \"province\": \"浙江\",\n" +
                "        \"Pcode\": \"ZJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"浙F\",\n" +
                "        \"city\": \"嘉兴\",\n" +
                "        \"province\": \"浙江\",\n" +
                "        \"Pcode\": \"ZJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"浙G\",\n" +
                "        \"city\": \"金华\",\n" +
                "        \"province\": \"浙江\",\n" +
                "        \"Pcode\": \"ZJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"浙H\",\n" +
                "        \"city\": \"衢州\",\n" +
                "        \"province\": \"浙江\",\n" +
                "        \"Pcode\": \"ZJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"浙J\",\n" +
                "        \"city\": \"台州\",\n" +
                "        \"province\": \"浙江\",\n" +
                "        \"Pcode\": \"ZJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"浙K\",\n" +
                "        \"city\": \"丽水\",\n" +
                "        \"province\": \"浙江\",\n" +
                "        \"Pcode\": \"ZJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"浙L\",\n" +
                "        \"city\": \"舟山\",\n" +
                "        \"province\": \"浙江\",\n" +
                "        \"Pcode\": \"ZJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"桂A\",\n" +
                "        \"city\": \"南宁\",\n" +
                "        \"province\": \"广西\",\n" +
                "        \"Pcode\": \"GX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"桂B\",\n" +
                "        \"city\": \"柳州\",\n" +
                "        \"province\": \"广西\",\n" +
                "        \"Pcode\": \"GX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"桂C\",\n" +
                "        \"city\": \"桂林\",\n" +
                "        \"province\": \"广西\",\n" +
                "        \"Pcode\": \"GX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"桂D\",\n" +
                "        \"city\": \"梧州\",\n" +
                "        \"province\": \"广西\",\n" +
                "        \"Pcode\": \"GX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"桂E\",\n" +
                "        \"city\": \"北海\",\n" +
                "        \"province\": \"广西\",\n" +
                "        \"Pcode\": \"GX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"桂F\",\n" +
                "        \"city\": \"崇左\",\n" +
                "        \"province\": \"广西\",\n" +
                "        \"Pcode\": \"GX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"桂G\",\n" +
                "        \"city\": \"来宾\",\n" +
                "        \"province\": \"广西\",\n" +
                "        \"Pcode\": \"GX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"桂H\",\n" +
                "        \"city\": \"桂林地区\",\n" +
                "        \"province\": \"广西\",\n" +
                "        \"Pcode\": \"GX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"桂J\",\n" +
                "        \"city\": \"贺州\",\n" +
                "        \"province\": \"广西\",\n" +
                "        \"Pcode\": \"GX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"桂K\",\n" +
                "        \"city\": \"玉林\",\n" +
                "        \"province\": \"广西\",\n" +
                "        \"Pcode\": \"GX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"桂L\",\n" +
                "        \"city\": \"百色\",\n" +
                "        \"province\": \"广西\",\n" +
                "        \"Pcode\": \"GX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"桂M\",\n" +
                "        \"city\": \"河池\",\n" +
                "        \"province\": \"广西\",\n" +
                "        \"Pcode\": \"GX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"桂N\",\n" +
                "        \"city\": \"钦州\",\n" +
                "        \"province\": \"广西\",\n" +
                "        \"Pcode\": \"GX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"桂P\",\n" +
                "        \"city\": \"防城港\",\n" +
                "        \"province\": \"广西\",\n" +
                "        \"Pcode\": \"GX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"桂R\",\n" +
                "        \"city\": \"贵港\",\n" +
                "        \"province\": \"广西\",\n" +
                "        \"Pcode\": \"GX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"蒙A\",\n" +
                "        \"city\": \"呼和浩特\",\n" +
                "        \"province\": \"内蒙古\",\n" +
                "        \"Pcode\": \"NMG\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"蒙B\",\n" +
                "        \"city\": \"包头\",\n" +
                "        \"province\": \"内蒙古\",\n" +
                "        \"Pcode\": \"NMG\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"蒙C\",\n" +
                "        \"city\": \"乌海\",\n" +
                "        \"province\": \"内蒙古\",\n" +
                "        \"Pcode\": \"NMG\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"蒙D\",\n" +
                "        \"city\": \"赤峰\",\n" +
                "        \"province\": \"内蒙古\",\n" +
                "        \"Pcode\": \"NMG\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"蒙E\",\n" +
                "        \"city\": \"呼伦贝尔 \",\n" +
                "        \"province\": \"内蒙古\",\n" +
                "        \"Pcode\": \"NMG\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"蒙F\",\n" +
                "        \"city\": \"兴安盟\",\n" +
                "        \"province\": \"内蒙古\",\n" +
                "        \"Pcode\": \"NMG\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"蒙G\",\n" +
                "        \"city\": \"通辽\",\n" +
                "        \"province\": \"内蒙古\",\n" +
                "        \"Pcode\": \"NMG\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"蒙H\",\n" +
                "        \"city\": \"锡林郭勒盟\",\n" +
                "        \"province\": \"内蒙古\",\n" +
                "        \"Pcode\": \"NMG\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"蒙J\",\n" +
                "        \"city\": \"乌兰察布盟\",\n" +
                "        \"province\": \"内蒙古\",\n" +
                "        \"Pcode\": \"NMG\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"蒙K\",\n" +
                "        \"city\": \"鄂尔多斯 \",\n" +
                "        \"province\": \"内蒙古\",\n" +
                "        \"Pcode\": \"NMG\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"蒙L\",\n" +
                "        \"city\": \"巴彦淖尔盟\",\n" +
                "        \"province\": \"内蒙古\",\n" +
                "        \"Pcode\": \"NMG\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"蒙M　\",\n" +
                "        \"city\": \"　阿拉善盟\",\n" +
                "        \"province\": \"内蒙古\",\n" +
                "        \"Pcode\": \"NMG\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"闽A\",\n" +
                "        \"city\": \"福州\",\n" +
                "        \"province\": \"福建\",\n" +
                "        \"Pcode\": \"FJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"闽B\",\n" +
                "        \"city\": \"莆田\",\n" +
                "        \"province\": \"福建\",\n" +
                "        \"Pcode\": \"FJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"闽C\",\n" +
                "        \"city\": \"泉州\",\n" +
                "        \"province\": \"福建\",\n" +
                "        \"Pcode\": \"FJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"闽D\",\n" +
                "        \"city\": \"厦门\",\n" +
                "        \"province\": \"福建\",\n" +
                "        \"Pcode\": \"FJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"闽E\",\n" +
                "        \"city\": \"漳州\",\n" +
                "        \"province\": \"福建\",\n" +
                "        \"Pcode\": \"FJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"闽F\",\n" +
                "        \"city\": \"龙岩\",\n" +
                "        \"province\": \"福建\",\n" +
                "        \"Pcode\": \"FJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"闽G\",\n" +
                "        \"city\": \"三明\",\n" +
                "        \"province\": \"福建\",\n" +
                "        \"Pcode\": \"FJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"闽H\",\n" +
                "        \"city\": \"南平\",\n" +
                "        \"province\": \"福建\",\n" +
                "        \"Pcode\": \"FJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"闽J\",\n" +
                "        \"city\": \"宁德\",\n" +
                "        \"province\": \"福建\",\n" +
                "        \"Pcode\": \"FJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"闽K\",\n" +
                "        \"city\": \"直系统\",\n" +
                "        \"province\": \"福建\",\n" +
                "        \"Pcode\": \"FJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"川A\",\n" +
                "        \"city\": \"成都\",\n" +
                "        \"province\": \"四川\",\n" +
                "        \"Pcode\": \"SC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"川B\",\n" +
                "        \"city\": \"绵阳\",\n" +
                "        \"province\": \"四川\",\n" +
                "        \"Pcode\": \"SC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"川C\",\n" +
                "        \"city\": \"自贡\",\n" +
                "        \"province\": \"四川\",\n" +
                "        \"Pcode\": \"SC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"川D\",\n" +
                "        \"city\": \"攀枝花\",\n" +
                "        \"province\": \"四川\",\n" +
                "        \"Pcode\": \"SC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"川E\",\n" +
                "        \"city\": \"泸州\",\n" +
                "        \"province\": \"四川\",\n" +
                "        \"Pcode\": \"SC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"川F\",\n" +
                "        \"city\": \"德阳\",\n" +
                "        \"province\": \"四川\",\n" +
                "        \"Pcode\": \"SC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"川H\",\n" +
                "        \"city\": \"广元\",\n" +
                "        \"province\": \"四川\",\n" +
                "        \"Pcode\": \"SC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"川J\",\n" +
                "        \"city\": \"遂宁\",\n" +
                "        \"province\": \"四川\",\n" +
                "        \"Pcode\": \"SC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"川K\",\n" +
                "        \"city\": \"内江\",\n" +
                "        \"province\": \"四川\",\n" +
                "        \"Pcode\": \"SC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"川L\",\n" +
                "        \"city\": \"乐山\",\n" +
                "        \"province\": \"四川\",\n" +
                "        \"Pcode\": \"SC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"川M\",\n" +
                "        \"city\": \"资阳\",\n" +
                "        \"province\": \"四川\",\n" +
                "        \"Pcode\": \"SC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"川Q\",\n" +
                "        \"city\": \"宜宾\",\n" +
                "        \"province\": \"四川\",\n" +
                "        \"Pcode\": \"SC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"川R\",\n" +
                "        \"city\": \"南充\",\n" +
                "        \"province\": \"四川\",\n" +
                "        \"Pcode\": \"SC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"川S\",\n" +
                "        \"city\": \"达州\",\n" +
                "        \"province\": \"四川\",\n" +
                "        \"Pcode\": \"SC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"川T\",\n" +
                "        \"city\": \"雅安\",\n" +
                "        \"province\": \"四川\",\n" +
                "        \"Pcode\": \"SC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"川U\",\n" +
                "        \"city\": \"阿坝藏族羌族自治州\",\n" +
                "        \"province\": \"四川\",\n" +
                "        \"Pcode\": \"SC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"川V\",\n" +
                "        \"city\": \"甘孜藏族自治州\",\n" +
                "        \"province\": \"四川\",\n" +
                "        \"Pcode\": \"SC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"川W\",\n" +
                "        \"city\": \"凉山彝族自治州\",\n" +
                "        \"province\": \"四川\",\n" +
                "        \"Pcode\": \"SC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"川X\",\n" +
                "        \"city\": \"广安\",\n" +
                "        \"province\": \"四川\",\n" +
                "        \"Pcode\": \"SC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"川Y\",\n" +
                "        \"city\": \"巴中\",\n" +
                "        \"province\": \"四川\",\n" +
                "        \"Pcode\": \"SC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"川Z\",\n" +
                "        \"city\": \"眉山\",\n" +
                "        \"province\": \"四川\",\n" +
                "        \"Pcode\": \"SC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"渝A\",\n" +
                "        \"city\": \"重庆区（江南）\",\n" +
                "        \"province\": \"重庆\",\n" +
                "        \"Pcode\": \"ZQ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"渝B\",\n" +
                "        \"city\": \"重庆区（江北）\",\n" +
                "        \"province\": \"重庆\",\n" +
                "        \"Pcode\": \"ZQ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"渝C\",\n" +
                "        \"city\": \"永川区\",\n" +
                "        \"province\": \"重庆\",\n" +
                "        \"Pcode\": \"ZQ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"渝F\",\n" +
                "        \"city\": \"万州区\",\n" +
                "        \"province\": \"重庆\",\n" +
                "        \"Pcode\": \"ZQ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"渝G\",\n" +
                "        \"city\": \"涪陵区\",\n" +
                "        \"province\": \"重庆\",\n" +
                "        \"Pcode\": \"ZQ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"渝H\",\n" +
                "        \"city\": \"黔江区\",\n" +
                "        \"province\": \"重庆\",\n" +
                "        \"Pcode\": \"ZQ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"津A\",\n" +
                "        \"city\": \"天津\",\n" +
                "        \"province\": \"天津\",\n" +
                "        \"Pcode\": \"TJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"津B\",\n" +
                "        \"city\": \"天津\",\n" +
                "        \"province\": \"天津\",\n" +
                "        \"Pcode\": \"TJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"津C\",\n" +
                "        \"city\": \"天津\",\n" +
                "        \"province\": \"天津\",\n" +
                "        \"Pcode\": \"TJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"津D\",\n" +
                "        \"city\": \"天津\",\n" +
                "        \"province\": \"天津\",\n" +
                "        \"Pcode\": \"TJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"津E\",\n" +
                "        \"city\": \"天津\",\n" +
                "        \"province\": \"天津\",\n" +
                "        \"Pcode\": \"TJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"津F\",\n" +
                "        \"city\": \"天津\",\n" +
                "        \"province\": \"天津\",\n" +
                "        \"Pcode\": \"TJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"津G\",\n" +
                "        \"city\": \"天津\",\n" +
                "        \"province\": \"天津\",\n" +
                "        \"Pcode\": \"TJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"津H\",\n" +
                "        \"city\": \"天津\",\n" +
                "        \"province\": \"天津\",\n" +
                "        \"Pcode\": \"TJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"云A\",\n" +
                "        \"city\": \"昆明\",\n" +
                "        \"province\": \"云南\",\n" +
                "        \"Pcode\": \"YN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"云A-V\",\n" +
                "        \"city\": \"东川\",\n" +
                "        \"province\": \"云南\",\n" +
                "        \"Pcode\": \"YN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"云C\",\n" +
                "        \"city\": \"昭通\",\n" +
                "        \"province\": \"云南\",\n" +
                "        \"Pcode\": \"YN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"云D\",\n" +
                "        \"city\": \"曲靖\",\n" +
                "        \"province\": \"云南\",\n" +
                "        \"Pcode\": \"YN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"云E\",\n" +
                "        \"city\": \"楚雄彝族自治州\",\n" +
                "        \"province\": \"云南\",\n" +
                "        \"Pcode\": \"YN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"云F\",\n" +
                "        \"city\": \"玉溪\",\n" +
                "        \"province\": \"云南\",\n" +
                "        \"Pcode\": \"YN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"云G\",\n" +
                "        \"city\": \"红河哈尼族彝族自治州\",\n" +
                "        \"province\": \"云南\",\n" +
                "        \"Pcode\": \"YN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"云H\",\n" +
                "        \"city\": \"文山壮族苗族自治州\",\n" +
                "        \"province\": \"云南\",\n" +
                "        \"Pcode\": \"YN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"云J\",\n" +
                "        \"city\": \"思茅\",\n" +
                "        \"province\": \"云南\",\n" +
                "        \"Pcode\": \"YN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"云K\",\n" +
                "        \"city\": \"西双版纳傣族自治州\",\n" +
                "        \"province\": \"云南\",\n" +
                "        \"Pcode\": \"YN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"云L\",\n" +
                "        \"city\": \"大理白族自治州\",\n" +
                "        \"province\": \"云南\",\n" +
                "        \"Pcode\": \"YN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"云M\",\n" +
                "        \"city\": \"保山\",\n" +
                "        \"province\": \"云南\",\n" +
                "        \"Pcode\": \"YN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"云N\",\n" +
                "        \"city\": \"德宏傣族景颇族自治州\",\n" +
                "        \"province\": \"云南\",\n" +
                "        \"Pcode\": \"YN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"云P\",\n" +
                "        \"city\": \"丽江\",\n" +
                "        \"province\": \"云南\",\n" +
                "        \"Pcode\": \"YN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"云Q\",\n" +
                "        \"city\": \"怒江傈僳族自治州\",\n" +
                "        \"province\": \"云南\",\n" +
                "        \"Pcode\": \"YN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"云R\",\n" +
                "        \"city\": \"迪庆藏族自治州\",\n" +
                "        \"province\": \"云南\",\n" +
                "        \"Pcode\": \"YN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"云S\",\n" +
                "        \"city\": \"临沧地区\",\n" +
                "        \"province\": \"云南\",\n" +
                "        \"Pcode\": \"YN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"湘A \",\n" +
                "        \"city\": \"长沙\",\n" +
                "        \"province\": \"湖南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"湘B\",\n" +
                "        \"city\": \"株洲\",\n" +
                "        \"province\": \"湖南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"湘C\",\n" +
                "        \"city\": \"湘潭\",\n" +
                "        \"province\": \"湖南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"湘D\",\n" +
                "        \"city\": \"衡阳\",\n" +
                "        \"province\": \"湖南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"湘E\",\n" +
                "        \"city\": \"邵阳\",\n" +
                "        \"province\": \"湖南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"湘F\",\n" +
                "        \"city\": \"岳阳\",\n" +
                "        \"province\": \"湖南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"湘G\",\n" +
                "        \"city\": \"张家界\",\n" +
                "        \"province\": \"湖南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"湘H\",\n" +
                "        \"city\": \"益阳\",\n" +
                "        \"province\": \"湖南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"湘J\",\n" +
                "        \"city\": \"常德\",\n" +
                "        \"province\": \"湖南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"湘K\",\n" +
                "        \"city\": \"娄底\",\n" +
                "        \"province\": \"湖南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"湘L\",\n" +
                "        \"city\": \"郴州\",\n" +
                "        \"province\": \"湖南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"湘M\",\n" +
                "        \"city\": \"永州\",\n" +
                "        \"province\": \"湖南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"湘N\",\n" +
                "        \"city\": \"怀化\",\n" +
                "        \"province\": \"湖南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"湘U\",\n" +
                "        \"city\": \"湘西土家族苗族自治州\",\n" +
                "        \"province\": \"湖南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"新A\",\n" +
                "        \"city\": \"乌鲁木齐\",\n" +
                "        \"province\": \"新疆\",\n" +
                "        \"Pcode\": \"XJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"新B\",\n" +
                "        \"city\": \"昌吉回族自治州\",\n" +
                "        \"province\": \"新疆\",\n" +
                "        \"Pcode\": \"XJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"新C\",\n" +
                "        \"city\": \"石河子\",\n" +
                "        \"province\": \"新疆\",\n" +
                "        \"Pcode\": \"XJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"新D\",\n" +
                "        \"city\": \"奎屯\",\n" +
                "        \"province\": \"新疆\",\n" +
                "        \"Pcode\": \"XJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"新E\",\n" +
                "        \"city\": \"博尔塔拉蒙古自治州\",\n" +
                "        \"province\": \"新疆\",\n" +
                "        \"Pcode\": \"XJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"新F\",\n" +
                "        \"city\": \"伊犁哈萨克自治州直辖县\",\n" +
                "        \"province\": \"新疆\",\n" +
                "        \"Pcode\": \"XJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"新G\",\n" +
                "        \"city\": \"塔城\",\n" +
                "        \"province\": \"新疆\",\n" +
                "        \"Pcode\": \"XJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"新H\",\n" +
                "        \"city\": \"阿勒泰\",\n" +
                "        \"province\": \"新疆\",\n" +
                "        \"Pcode\": \"XJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"新J\",\n" +
                "        \"city\": \"克拉玛依\",\n" +
                "        \"province\": \"新疆\",\n" +
                "        \"Pcode\": \"XJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"新K\",\n" +
                "        \"city\": \"吐鲁番\",\n" +
                "        \"province\": \"新疆\",\n" +
                "        \"Pcode\": \"XJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"新L\",\n" +
                "        \"city\": \"哈密\",\n" +
                "        \"province\": \"新疆\",\n" +
                "        \"Pcode\": \"XJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"新M\",\n" +
                "        \"city\": \"巴音郭愣蒙古自治州\",\n" +
                "        \"province\": \"新疆\",\n" +
                "        \"Pcode\": \"XJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"新N\",\n" +
                "        \"city\": \"阿克苏\",\n" +
                "        \"province\": \"新疆\",\n" +
                "        \"Pcode\": \"XJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"新P\",\n" +
                "        \"city\": \"克孜勒苏柯尔克孜自治州\",\n" +
                "        \"province\": \"新疆\",\n" +
                "        \"Pcode\": \"XJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"新Q\",\n" +
                "        \"city\": \"喀什\",\n" +
                "        \"province\": \"新疆\",\n" +
                "        \"Pcode\": \"XJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"新R\",\n" +
                "        \"city\": \"和田\",\n" +
                "        \"province\": \"新疆\",\n" +
                "        \"Pcode\": \"XJ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"赣A\",\n" +
                "        \"city\": \"南昌\",\n" +
                "        \"province\": \"江西\",\n" +
                "        \"Pcode\": \"JX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"赣B\",\n" +
                "        \"city\": \"赣州\",\n" +
                "        \"province\": \"江西\",\n" +
                "        \"Pcode\": \"JX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"赣C\",\n" +
                "        \"city\": \"宜春\",\n" +
                "        \"province\": \"江西\",\n" +
                "        \"Pcode\": \"JX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"赣D\",\n" +
                "        \"city\": \"吉安\",\n" +
                "        \"province\": \"江西\",\n" +
                "        \"Pcode\": \"JX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"赣E\",\n" +
                "        \"city\": \"上饶\",\n" +
                "        \"province\": \"江西\",\n" +
                "        \"Pcode\": \"JX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"赣F\",\n" +
                "        \"city\": \"抚州\",\n" +
                "        \"province\": \"江西\",\n" +
                "        \"Pcode\": \"JX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"赣G\",\n" +
                "        \"city\": \"九江\",\n" +
                "        \"province\": \"江西\",\n" +
                "        \"Pcode\": \"JX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"赣H\",\n" +
                "        \"city\": \"景德镇\",\n" +
                "        \"province\": \"江西\",\n" +
                "        \"Pcode\": \"JX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"赣J\",\n" +
                "        \"city\": \"萍乡\",\n" +
                "        \"province\": \"江西\",\n" +
                "        \"Pcode\": \"JX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"赣K\",\n" +
                "        \"city\": \"新余\",\n" +
                "        \"province\": \"江西\",\n" +
                "        \"Pcode\": \"JX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"赣L\",\n" +
                "        \"city\": \"鹰潭\",\n" +
                "        \"province\": \"江西\",\n" +
                "        \"Pcode\": \"JX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"赣M\",\n" +
                "        \"city\": \"南昌,直系统\",\n" +
                "        \"province\": \"江西\",\n" +
                "        \"Pcode\": \"JX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"甘A\",\n" +
                "        \"city\": \"兰州\",\n" +
                "        \"province\": \"甘肃\",\n" +
                "        \"Pcode\": \"GS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"甘B\",\n" +
                "        \"city\": \"嘉峪关\",\n" +
                "        \"province\": \"甘肃\",\n" +
                "        \"Pcode\": \"GS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"甘C\",\n" +
                "        \"city\": \"金昌\",\n" +
                "        \"province\": \"甘肃\",\n" +
                "        \"Pcode\": \"GS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"甘D\",\n" +
                "        \"city\": \"白银\",\n" +
                "        \"province\": \"甘肃\",\n" +
                "        \"Pcode\": \"GS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"甘E\",\n" +
                "        \"city\": \"天水\",\n" +
                "        \"province\": \"甘肃\",\n" +
                "        \"Pcode\": \"GS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"甘F\",\n" +
                "        \"city\": \"酒泉\",\n" +
                "        \"province\": \"甘肃\",\n" +
                "        \"Pcode\": \"GS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"甘G\",\n" +
                "        \"city\": \"张掖\",\n" +
                "        \"province\": \"甘肃\",\n" +
                "        \"Pcode\": \"GS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"甘H\",\n" +
                "        \"city\": \"武威\",\n" +
                "        \"province\": \"甘肃\",\n" +
                "        \"Pcode\": \"GS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"甘J\",\n" +
                "        \"city\": \"定西\",\n" +
                "        \"province\": \"甘肃\",\n" +
                "        \"Pcode\": \"GS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"甘K\",\n" +
                "        \"city\": \"陇南\",\n" +
                "        \"province\": \"甘肃\",\n" +
                "        \"Pcode\": \"GS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"甘L\",\n" +
                "        \"city\": \"平凉\",\n" +
                "        \"province\": \"甘肃\",\n" +
                "        \"Pcode\": \"GS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"甘M\",\n" +
                "        \"city\": \"庆阳\",\n" +
                "        \"province\": \"甘肃\",\n" +
                "        \"Pcode\": \"GS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"甘N\",\n" +
                "        \"city\": \"临夏回族自治州\",\n" +
                "        \"province\": \"甘肃\",\n" +
                "        \"Pcode\": \"GS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"甘P\",\n" +
                "        \"city\": \"甘南藏族自治州\",\n" +
                "        \"province\": \"甘肃\",\n" +
                "        \"Pcode\": \"GS\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"陕A\",\n" +
                "        \"city\": \"西安\",\n" +
                "        \"province\": \"陕西\",\n" +
                "        \"Pcode\": \"SX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"陕B\",\n" +
                "        \"city\": \"铜川\",\n" +
                "        \"province\": \"陕西\",\n" +
                "        \"Pcode\": \"SX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"陕C\",\n" +
                "        \"city\": \"宝鸡\",\n" +
                "        \"province\": \"陕西\",\n" +
                "        \"Pcode\": \"SX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"陕D\",\n" +
                "        \"city\": \"咸阳\",\n" +
                "        \"province\": \"陕西\",\n" +
                "        \"Pcode\": \"SX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"陕E\",\n" +
                "        \"city\": \"渭南\",\n" +
                "        \"province\": \"陕西\",\n" +
                "        \"Pcode\": \"SX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"陕F\",\n" +
                "        \"city\": \"汉中\",\n" +
                "        \"province\": \"陕西\",\n" +
                "        \"Pcode\": \"SX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"陕G\",\n" +
                "        \"city\": \"安康\",\n" +
                "        \"province\": \"陕西\",\n" +
                "        \"Pcode\": \"SX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"陕H\",\n" +
                "        \"city\": \"商洛\",\n" +
                "        \"province\": \"陕西\",\n" +
                "        \"Pcode\": \"SX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"陕J\",\n" +
                "        \"city\": \"延安\",\n" +
                "        \"province\": \"陕西\",\n" +
                "        \"Pcode\": \"SX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"陕K\",\n" +
                "        \"city\": \"榆林\",\n" +
                "        \"province\": \"陕西\",\n" +
                "        \"Pcode\": \"SX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"陕V\",\n" +
                "        \"city\": \"杨凌高新农业示范区\",\n" +
                "        \"province\": \"陕西\",\n" +
                "        \"Pcode\": \"SX\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"贵A\",\n" +
                "        \"city\": \"贵阳\",\n" +
                "        \"province\": \"贵州\",\n" +
                "        \"Pcode\": \"GZ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"贵B\",\n" +
                "        \"city\": \"六盘水\",\n" +
                "        \"province\": \"贵州\",\n" +
                "        \"Pcode\": \"GZ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"贵C\",\n" +
                "        \"city\": \"遵义\",\n" +
                "        \"province\": \"贵州\",\n" +
                "        \"Pcode\": \"GZ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"贵D\",\n" +
                "        \"city\": \"铜仁\",\n" +
                "        \"province\": \"贵州\",\n" +
                "        \"Pcode\": \"GZ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"贵E\",\n" +
                "        \"city\": \"黔西南布依族苗族自治州\",\n" +
                "        \"province\": \"贵州\",\n" +
                "        \"Pcode\": \"GZ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"贵F\",\n" +
                "        \"city\": \"毕节\",\n" +
                "        \"province\": \"贵州\",\n" +
                "        \"Pcode\": \"GZ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"贵G\",\n" +
                "        \"city\": \"安顺\",\n" +
                "        \"province\": \"贵州\",\n" +
                "        \"Pcode\": \"GZ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"贵H\",\n" +
                "        \"city\": \"黔东南苗族侗族自治州\",\n" +
                "        \"province\": \"贵州\",\n" +
                "        \"Pcode\": \"GZ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"贵J\",\n" +
                "        \"city\": \"黔南布依族苗族自治州\",\n" +
                "        \"province\": \"贵州\",\n" +
                "        \"Pcode\": \"GZ\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"青A\",\n" +
                "        \"city\": \"西宁\",\n" +
                "        \"province\": \"青海\",\n" +
                "        \"Pcode\": \"QH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"青B\",\n" +
                "        \"city\": \"海东\",\n" +
                "        \"province\": \"青海\",\n" +
                "        \"Pcode\": \"QH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"青C\",\n" +
                "        \"city\": \"海北藏族自治州\",\n" +
                "        \"province\": \"青海\",\n" +
                "        \"Pcode\": \"QH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"青D\",\n" +
                "        \"city\": \"黄南藏族自治州\",\n" +
                "        \"province\": \"青海\",\n" +
                "        \"Pcode\": \"QH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"青E\",\n" +
                "        \"city\": \"藏族自治州\",\n" +
                "        \"province\": \"青海\",\n" +
                "        \"Pcode\": \"QH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"青F\",\n" +
                "        \"city\": \"果洛藏族自治州\",\n" +
                "        \"province\": \"青海\",\n" +
                "        \"Pcode\": \"QH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"青G\",\n" +
                "        \"city\": \"玉树藏族自治州\",\n" +
                "        \"province\": \"青海\",\n" +
                "        \"Pcode\": \"QH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"青H\",\n" +
                "        \"city\": \"海西蒙古族藏族自治州\",\n" +
                "        \"province\": \"青海\",\n" +
                "        \"Pcode\": \"QH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"藏A\",\n" +
                "        \"city\": \"拉萨\",\n" +
                "        \"province\": \"西藏\",\n" +
                "        \"Pcode\": \"XC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"藏B\",\n" +
                "        \"city\": \"昌都地区\",\n" +
                "        \"province\": \"西藏\",\n" +
                "        \"Pcode\": \"XC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"藏C\",\n" +
                "        \"city\": \"山南地区\",\n" +
                "        \"province\": \"西藏\",\n" +
                "        \"Pcode\": \"XC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"藏D\",\n" +
                "        \"city\": \"日喀则地区\",\n" +
                "        \"province\": \"西藏\",\n" +
                "        \"Pcode\": \"XC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"藏E\",\n" +
                "        \"city\": \"那曲地区\",\n" +
                "        \"province\": \"西藏\",\n" +
                "        \"Pcode\": \"XC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"藏F\",\n" +
                "        \"city\": \"阿里地区\",\n" +
                "        \"province\": \"西藏\",\n" +
                "        \"Pcode\": \"XC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"藏G\",\n" +
                "        \"city\": \"林芝地区\",\n" +
                "        \"province\": \"西藏\",\n" +
                "        \"Pcode\": \"XC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"藏H\",\n" +
                "        \"city\": \"天全县车辆管理所\",\n" +
                "        \"province\": \"西藏\",\n" +
                "        \"Pcode\": \"XC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"藏J\",\n" +
                "        \"city\": \"格尔木车辆管理所\",\n" +
                "        \"province\": \"西藏\",\n" +
                "        \"Pcode\": \"XC\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"琼A\",\n" +
                "        \"city\": \"海口\",\n" +
                "        \"province\": \"海南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"琼B\",\n" +
                "        \"city\": \"三亚\",\n" +
                "        \"province\": \"海南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"琼C\",\n" +
                "        \"city\": \"琼海\",\n" +
                "        \"province\": \"海南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"琼D\",\n" +
                "        \"city\": \"五指山\",\n" +
                "        \"province\": \"海南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"琼E\",\n" +
                "        \"city\": \"洋浦开发区\",\n" +
                "        \"province\": \"海南\",\n" +
                "        \"Pcode\": \"HN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"沪A\",\n" +
                "        \"city\": \"上海\",\n" +
                "        \"province\": \"上海\",\n" +
                "        \"Pcode\": \"SH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"沪B\",\n" +
                "        \"city\": \"上海\",\n" +
                "        \"province\": \"上海\",\n" +
                "        \"Pcode\": \"SH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"沪C\",\n" +
                "        \"city\": \"上海\",\n" +
                "        \"province\": \"上海\",\n" +
                "        \"Pcode\": \"SH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"沪D\",\n" +
                "        \"city\": \"上海\",\n" +
                "        \"province\": \"上海\",\n" +
                "        \"Pcode\": \"SH\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"code\": \"沪R\",\n" +
                "        \"city\": \"崇明、长兴、横沙\",\n" +
                "        \"province\": \"上海\",\n" +
                "        \"Pcode\": \"SH\"\n" +
                "    }\n" +
                "]";
        String city = "未查询到该城市";
        if(license.charAt(1)<=122&&license.charAt(1)>=97&&license.length()==2) {
            StringBuilder stringBuilder=new StringBuilder(license);
            char b=(char)(license.charAt(1)-32);
            stringBuilder.setCharAt(1,b);
            license=stringBuilder.toString();
        }
        Gson gson = new Gson();
        List<License> licenseList = gson.fromJson(response, new TypeToken<List<License>>() {
        }.getType());
        for (License license1 : licenseList) {
            if (license1.getCode().equals(license)) {
                city = license1.getCity();
                break;
            }
        }
        return city;
    }
}
