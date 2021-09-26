/* 测试枚举类
 * 1. 普通枚举写法
 * 2. 带构造函数的枚举
 * 3. 枚举的构造函数是否可以使用 "默认" 修饰符
 * 4. 包含抽象方法的枚举
 */

// 👇 普通枚举
enum Size {
  SMALL, MEDIUM, LARGE, EXTRA_LARGE
}

// 👇 带构造函数的枚举
enum Gender {
  MALE("MAN"), FEMALE("WOMAN");

  private final String alias;

  private Gender(String alias) {
    this.alias = alias;
  }

  public String getAlias() {
    return alias;
  }
}

// 👇 带 "默认" 构造函数的枚举
enum Days {
  SUNDAY(7), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);

  private final int value;

  Days(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }
}

enum Color {
  RED {
    @Override
    public String getColor() {
      return "红色";
    }
  },
  GREEN {
    @Override
    public String getColor() {
      return "绿色";
    }
  },
  BLUE {
    @Override
    public String getColor() {
      return "蓝色";
    }
  };
  public abstract String getColor();
}

public class EnumTest {
  public static void main(String[] args) {
    final Size large = Enum.valueOf(Size.class, "LARGE");
    final Gender male = Gender.MALE;
    final Days monday = Days.MONDAY;
    final Color red = Color.RED;

    System.out.println(large.toString());
    System.out.println(male.getAlias());
    System.out.println(monday.getValue());
    System.out.println(red.getColor());

    final Days[] values = Days.values();
    for (Days days : values) {
      System.out.println(days);
    }

    System.out.println(male.ordinal());

    System.out.println(Days.SUNDAY.compareTo(Days.FRIDAY));
  }
}
