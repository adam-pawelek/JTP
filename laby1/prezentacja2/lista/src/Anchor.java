public class Anchor {






        class Element{
            int val;
            Element next;
            public Element(int val){
                this.val = val;
            }
        }

        Element head = null, ogon = null;




        public void insertAtTheEnd(int val){
            if(head==null){
                Element temp = new Element(val);
                head = temp;
                ogon = temp;
            }else{
                ogon.next = new Element(val);
                ogon = ogon.next;
            }
        }


        public void insertAtTheFront(int val){
            if(head==null){
                Element tymczasowy = new Element(val);
                head = tymczasowy;
                ogon = tymczasowy;
            }else{
                Element tymczasowy = new Element(val);
                tymczasowy.next = head;
                head = tymczasowy;
            }
        }




        public void removeLast(){
            Element tymczasowy = head;
            while(tymczasowy.next!=null && tymczasowy.next.next!=null){
                tymczasowy = tymczasowy.next;
            }
            tymczasowy.next = null;
            ogon = tymczasowy;
        }


        public void removeFirst(){

            head = head.next;
        }




        public void printLinkedList(){
            System.out.println();
            Element tymczasowy = head;
            while(tymczasowy!=null){
                System.out.print(" "+tymczasowy.val);
                tymczasowy = tymczasowy.next;
            }
        }

        public String toString(){
            String wyn;
            wyn = "";
            //System.out.println();
            Element tymczasowy = head;
            while(tymczasowy!=null){
                wyn += Integer.toString(tymczasowy.val);
                wyn+= " ";
                tymczasowy = tymczasowy.next;
            }
            return wyn;

        }


    }










