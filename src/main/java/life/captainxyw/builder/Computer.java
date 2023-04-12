package life.captainxyw.builder;

public class Computer {
    private String cpu;

    private String ram;

    private String rom;

    private Computer(String cpu, String ram, String rom) {
        this.cpu = cpu;
        this.ram = ram;
        this.rom = rom;
    }

    private static class Builder {
        private String cpu;

        private String ram;

        private String rom;

        public Computer build() {
            Computer computer = new Computer(this.cpu, this.ram, this.rom);
            return computer;
        }
        public String getCpu() {
            return cpu;
        }

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public String getRam() {
            return ram;
        }

        public Builder ram(String ram) {
            this.ram = ram;
            return this;
        }

        public String getRom() {
            return rom;
        }

        public Builder rom(String rom) {
            this.rom = rom;
            return this;
        }

    }

    public static Builder builder() {
        return new Computer.Builder();
    }

    public static void main(String[] args) {
        Computer computer = Computer.builder().cpu("111").ram("222").rom("333333333333333333333333333333333").build();
        System.out.println(computer);
        new Computer.Builder();
    }
}

class Test {
    public static void main(String[] args) {
    }
}
