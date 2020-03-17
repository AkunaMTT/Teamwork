/**
 * @author description
 * @date 2020/3/5
 */
public class ClassA {
        // 保证输入数据大于0
        static int f(int w, int s, int c){
            if(c < 2) return 0;
            if(c == 2){
                if(s > 1) return 0;
                if(w < 2) return 0;
                return 1;
            }
            if(w <= s) return 0;
            if(c > w) return w-s;

            while(s > 0){
                if(w < s) {
                    w = 0;
                    break;
                }
                if(w%c <= 2) w -= w%c;
                w -= (w-1) / c * 2 + 1;
                s--;
            }

            return w;
        }

        static void test(int w, int s, int c){
            System.out.println(String.format("w=%d s=%d c=%d --> %d", w, s, c, f(w,s,c)));
        }

        public static void main(String[] args){
            test(300,100,100);

        }
    }

