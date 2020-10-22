package dunzo.dunzo;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        DunzoBiz biz = new DunzoBiz();
        
        Integer[] energyArray = new Integer[] { 2, 1, 1 };
        Integer[] coinsArray = new Integer[] { 11, 5, 7 };
        long initialEnergy = 0;
        
//        Integer[] energyArray =
//        		
//        		new Integer[] { 837,796,418,318,144,698,879,367,194,781,756,323,139,850,485,311,693,898,364,304,552,340,170,680,401,248,392,920,563,717,941,37,838,302,752,710,335,448,688,988,313,935,833,107,523,465,531,792,985,659,622,931,103,211,712,583,859,845,531,360,547,754,208,316,111,294,552,453,680,721,509,270,897,969,980,404,277,998,190,255,249,830,983,633,812,457,422,310,540,992,822,461,474,625,357,102,961,750,315,252,650,527,973,509,20,701,11,191,971,241,46,445,982,956,543,546,229,312,956,246,251,615,67,175,840,963,148,378,771,477,273,138,182,321,298,408,761,10,479,163,796,203,269,514,687,646,901,64,373,759,625,646,648,779,568,16,374,614,692,697,701,651,394,400,67,312,122,543,49,72,976,113,176,338,146,717,949,874,394,600,649,927,630,175,396,845,903,981,659,411,223,554,759,744,614,581,329,922,438,436,587,967,294,321,464,319,620,22,894,377,862,364,163,998,987,905,6,539,846,633,512,635,91,86,730,596,908,786,920,720,822,940,391,303,960,90,403,35,452,502,964,332,113,52,178,765,600,547,998,887,446,554,675,12,769,836,941,879,222,607,953,330,506,626,557,56,775,749,201,588,826,637,679,906,227,920,190,76,261,222,741,815,254,48,54,256,849,221,33,329,466,427,235,984,73,164,190,266,275,649,763,764,974,546,797,402,484,479,320,924,345,921,378,13,256,516,481,525,506,65,725,50,593,887,734,971,461,402,473,341,196,167,848,97,551,526,928,958,971,33,383,51,117,812,133,536,10,78,250,197,342,599,745,442,523,418,115,721,492,293,903,754,850,702,216,573,567,745,759,773,209,375,123,115,729,705,7,40,741,645,283,327,771,464,437,42,911,477,737,652,111,501,518,807,444,679,788,855,148,778,987,415,990,89,749,290,381,46,847,12,713,154,499,259,866,171,154,912,919,775,584,162,614,793,672,405,996,546,411,359,7,841,851,515,842,550,860,666,465,459,741,6,926,332,675,945,283,641,791,254,673,817,641,333,416,346,493,285,488,774,93,181,512,559,975,307,260,391,216,81,956,441,393,405,347,628,50,392,334,201,92,562,342,131,283,460,55,975,723,245,177,860,306,169,382,964,687,86,782,499,578,57,184,128,516,729,218,586,328,754,378,820,346,470,293,732,46,54,953,441,348,455,751,323,683,83,459,727,932,981,142,323,561,329,131,831,437,26,513,701,69,166,737,874,616,904,400,965,163,77,351,839,200,145,937,940,15,435,469,393,965,22,581,566,781,617,366,502,189,481,177,797,834,749,545,610,46,626,270,661,97,240,913,442,885,917,201,46,327,417,189,449,51,466,611,189,711,321,577,735,722,804,426,187,574,301,523,453,93,995,782,677,400,399,886,930,325,898,741,466,34,437,355,488,301,9,711,712,285,825,107,528,231,844,443,743,170,839,582,466,988,970,17,892,624,698,640,622,519,120,494,815,248,887,518,46,371,644,563,374,906,193,349,753,449,514,686,56,196,363,452,122,275,577,327,747,482,425,661,246,476,143,900,966,473,840,584,530,693,657,421,512,595,241,888,227,194,324,809,47,390,786,747,764,578,439,799,633,77,388,326,636,51,895,134,351,446,350,343,220,780,473,974,181,842,233,122,637,593,851,509,123,952,538,437,913,298,244,491,39,514,540,827,101,644,136,110,121,62,691,244,110,455,117,182,462,294,113,571,312,318,40,450,485,472,965,608,960,914,48,497,941,519,583,780,756,199,458,242,757,145,813,15,293,86,140,205,994,527,577,413,756,818,362,263,357,240,161,236,474,683,740,882,338,518,206,152,959,205,285,683,226,912,422,344,276,354,461,10,906,582,770,639,576,924,960,390,450,472,904,883,663,939,734,910,255,863,241,729,870,229,873,89,289,346,364,199,969,713,370,999,349,890,514,896,325,172,972,165,805,310,185,763,374,565,119,421,739,601,809,253,898,384,846,316,961,519,545,507,156,702,914,610,36,811,155,185,194,482,205,269,949,596,211,678,96,982,511,919,631,708,172,749,19,92,125,27,51,735,244,709,30,934,277,716,167,938,947,394,248,783,995,814,434,329,176,546,260,928,127,715,258,552,348,897,384,324,228,319,855,227,493,973,726,267,242,765,965,486,132,226,727,82,278,416,374,438,415,944,867,218,781,554,741,965,32,264,322,357,276,328,764,387,540,979,718,172,891,868,447,599,396,43,742,932,822,426,831,546,320,263,164,444,355,452,760,708,671,4,264 };
//        Integer[] coinsArray = new Integer[] { 249,454,390,355,533,313,366,651,130,903,411,652,654,413,323,581,196,763,470,733,437,659,17,200,743,95,697,178,469,163,619,819,671,777,881,531,683,492,824,583,468,327,280,877,650,766,667,941,514,533,370,193,360,720,140,503,330,547,240,491,94,315,38,234,535,396,609,221,548,437,695,674,522,737,100,210,819,327,491,854,142,932,223,419,953,935,385,704,733,853,611,381,897,223,5,166,369,225,421,608,464,956,676,796,244,846,463,226,18,344,403,63,809,56,93,106,786,792,392,75,256,527,536,85,581,127,919,143,942,79,134,669,0,609,583,692,59,662,0,829,797,585,827,185,626,369,315,975,891,155,385,833,284,608,480,870,315,19,766,868,102,70,836,99,115,404,352,978,774,562,545,644,943,266,74,243,714,168,963,1,227,641,12,298,977,272,411,790,658,107,416,685,543,909,583,692,2,798,270,679,205,984,432,623,93,51,809,902,271,811,75,489,378,312,968,198,805,991,33,621,402,511,94,579,971,142,399,725,475,461,514,531,481,737,502,669,121,820,584,466,507,796,196,230,928,450,142,435,90,373,321,468,963,871,144,710,633,144,347,504,48,515,613,301,809,926,563,783,522,901,303,414,14,145,374,273,854,781,238,788,159,554,453,691,990,739,798,342,626,891,229,357,929,830,980,774,173,254,695,452,560,143,990,98,854,20,392,225,59,787,848,671,652,806,107,137,754,652,871,914,52,192,43,403,484,192,386,69,870,24,945,189,820,768,788,48,941,108,772,952,375,90,916,445,522,465,236,751,759,128,837,274,865,917,61,483,547,135,718,179,739,374,867,530,421,521,962,893,730,232,536,571,99,604,505,37,32,931,223,428,902,601,750,143,793,307,61,765,574,877,215,575,700,735,747,802,339,595,360,212,758,282,677,532,685,384,568,623,223,741,30,625,774,253,555,417,643,666,554,440,483,849,238,66,986,443,378,821,247,860,22,451,336,745,459,235,984,237,410,717,981,957,511,53,895,950,780,863,999,131,19,188,892,467,803,868,835,130,288,197,280,710,268,466,88,941,114,407,73,653,684,468,204,549,99,985,482,770,376,657,757,204,209,482,808,827,510,604,570,259,740,559,198,680,609,522,182,486,145,265,194,871,937,207,868,243,426,413,142,547,113,385,894,455,76,818,704,777,79,306,588,129,735,102,994,593,607,755,99,668,258,353,282,811,600,668,27,673,628,656,179,24,645,37,393,514,380,715,443,309,581,880,531,169,546,200,51,651,244,476,398,767,195,398,898,841,152,459,747,997,809,522,594,929,749,709,86,151,80,950,353,703,513,636,190,572,643,93,217,573,857,869,416,199,901,992,600,81,266,597,404,513,344,77,314,437,553,674,349,429,106,858,922,383,651,830,61,434,539,510,964,527,134,296,800,980,824,680,111,332,198,738,220,580,347,478,427,942,72,380,335,243,192,264,335,293,963,287,489,379,945,667,765,129,882,986,974,191,683,102,772,376,556,713,661,622,664,72,717,51,676,378,44,627,507,552,935,289,1,774,665,168,79,875,483,211,798,350,746,206,400,849,697,446,835,227,38,198,879,529,361,821,619,628,18,140,491,57,994,212,204,468,254,623,427,166,143,821,163,666,629,75,165,74,621,455,421,623,976,398,850,545,302,58,974,499,811,710,87,979,17,884,598,417,766,402,678,598,232,991,911,390,518,372,371,185,208,833,744,190,106,445,632,73,805,715,5,535,358,97,673,7,595,274,93,844,27,759,24,784,166,665,562,851,85,507,986,149,819,693,429,320,676,627,552,89,132,264,24,616,68,125,967,549,88,639,722,78,173,248,161,831,521,4,526,17,547,254,106,190,509,364,684,812,942,833,675,592,709,857,998,564,731,754,818,876,481,378,636,390,346,323,288,633,570,454,794,799,431,455,938,253,726,621,837,874,473,477,801,606,656,863,17,846,382,705,650,981,453,410,341,693,772,970,575,342,744,305,549,982,577,549,587,146,383,455,567,123,148,648,466,949,251,864,751,796,130,136,855,880,380,569,691,770,522,540,156,671,939,667,488,989,369,39,197,396,783,612,211,47,928,730,477,691,704,894,761,695,401,432,792,612,31,438,736,582,141,449,976,52,444,30,267,653,504,31,880,556,462,211,921,541,11,172,844,928,151,967,495,694,930,882,95,777,405,281,34,729,788,945,178,244,10,632,357,214,758,228,20,201,580,660,505,910,983,788,845,781,190,317,752,353,229,836,130,464,894,809,337,450 };
//        long initialEnergy = 761;
//        
        
        List<Integer> energy = Arrays.asList(energyArray);
        List<Integer> coins = Arrays.asList(coinsArray);
        int maxCoins = biz.getRich(initialEnergy, energy, coins);
        System.out.println(maxCoins);
    }
}
