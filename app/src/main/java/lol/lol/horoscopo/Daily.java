package lol.lol.horoscopo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Random;

public class Daily extends AppCompatActivity {

    private AdView mAdView;

    private String word[] = {"Atrévete a combinar esos pantalones de cuadros con la blusa de lunares. Como accesorio ponte una bufanda de plumas rosas y una chaqueta a rayas. ¡Deja que tu parte excéntrica se luzca! Semana espectacular.",
            "Debes sentirte libre para expresarte de manera abierta y fuerte al mundo que te rodea. Deberías experimentar una fuerte confianza en ti para aprovechar este momento al máximo.",
    "Hay una inquietud encendida en tu interior que se activa porque sientes que no estás cumpliendo con tu destino. Quizás tengas la visión de un propósito superior en la vida de lo que estás haciendo actualmente.",
    "Analiza y fíjate qué puedes hacer para moverte hacia este fuerte deseo que viene de tus entrañas. Este es el momento perfecto para poner en acción grandes objetivos de largo plazo.",
    "Trata de dejar acumulado el trabajo serio, para realizar actividades más ligeras, En realidad, piensa en aprovechar al máximo este fin de semana, tomándole libre.",
    "El trabajo constante y la falta de diversión causan un daño mucho más grave que el entorpecimiento: pueden conducir al agotamiento y la enfermedad. No permitas que esto te ocurra. Haz planes para divertirte, y luego sal a divertirte al máximo.",
    "Descubrirás que te encuentras en un estado mucho mejor para producir.\n" +
            "\n" +
            "Puedes sentir que alguien pretende que cuestiones tus valores o tu discernimiento.",
    "Es probable que sientas que por mucho que lo intenten, no podrán modificar tus opiniones. Tienes el coraje que te dan las convicciones y no te doblegarás con facilidad.",
    "Algunos pueden pensar que eres cabeza dura, pero consuélate al saber que cualquiera que trata de cambiar tus opiniones lo hace por sus propios intereses. ¡No te dejes convencer!",
    "Es probable que esta semana hayas trabajado todo el día a la antigua, y esto te animará a disfrutar un poco de diversión. Aunque sean días laborables para ti, siempre están el almuerzo y las horas siguientes al trabajo, para participar en algo ligero.",
    "Da una caminata con un amigo o amiga; sal a comer, juega un juego de azar o alquila una película esta noche. Haz planes para lo que más disfrutes. Deja que este receso te dé el rejuvenecimiento que necesitas.",
    "Estos días podrían tener una cierta carga negativa que solamente empeorará si continúas con esa actitud obstinada sobre todos los temas que te llaman la atención. Solamente encontrarás resistencia extrema.",
    "Si no eres religioso, sólo sentirás que un bello sentimiento te invade. Tendrás la sensación de que hay un ángel guardián presente. O presentirás que has sido visitado ¡por una musa inspiradora!",
    "Eres bueno para ver los dos lados de un asunto. Tu signo muestra que tu personalidad busca el balance y la tranquilidad. No te gustan los extremos. Y no te agrada juzgar enseguida.",
    "Hoy un ser querido o un amigo intentará atraerte para que te pongas de su lado en una discusión. A pesar de que lo aprecias, no tienes que hacerlo. Intenta no juzgar por bien o mal.",
            "Hoy te levantarás enojado con el mundo. Antes de arriesgarte de perder la cabeza por la más mínima provocación, mejor tómate un tiempo para analizar el origen de tu enojo. Puedes darte cuenta de que sólo estás enojado contigo, con nadie más.",
    "Quizás no pudiste tomar ventaja de ciertas oportunidades que se te ofrecieron y ahora te arrepientes de tu decisión. Nunca es tarde para lograr el éxito. Si te concentras en esto, verás que habrá más oportunidades en el futuro.",
    "La energía de hoy debería traerte muchos placeres sociales. ¡Ten cuidado, sin embargo, de los chismes! Siempre es divertido enterarse de historias sorprendentes de los amigos y colegas.",
    "Recuerda que cada vez que se cuenta, la verdad de la historia parece alejarse más y más. Trata de no caer en la tentación de repetir las historias que has oído. Piensa en cómo te sentirías si los tantos fueran al revés…",
    "Hoy analizarás las responsabilidades que has tomado. Trabajas duro pero a veces te embarcas en demasiadas cosas. ¿Te das la posibilidad de descansar y desenchufarte? ¿O te llenas de tantos compromisos que ni siquiera tienes un minuto para ti mismo?",
    "Este es un buen momento para examinar la realidad de esos problemas que vienes arrastrando de tiempo atrás. No temas cambiar algo que no funciona. Tu mejor actitud es mantenerte objetivo.",
    "Descubrirás un nuevo grupo social. Quizás asistas a un taller. Allí te contactarás con otros estudiantes., No temas intercambiar números telefónicos y construir una amistad. Disfrutarás interactuando con personas algo diferente a tus usuales compañeros.",
    "Necesitas un estímulo social constante para ser verdaderamente feliz. A los de tu signo les encanta todo tipo de personas, por consiguiente abre tu puerta a nuevas caras.",
    "Estarás pensando en las cosas que deseas. Sentirás que necesitas comprar algunas nuevas. Quizás tus muebles estén viejos y gastados. No hay nada malo en averiguar el precio de algunos artículos más nuevos.",
            "Un presupuesto apretado significa que las jornadas de compras no deben formar parte de la agenda. No obstante, tu energía creativa es alta, y puedes volver esta situación a tu favor al transformar tus posesiones existentes en artículos nuevos y originales",
    "Tus planes financieros lucen verdaderamente bien, pero lo cierto es que podrían verse todavía mejor. Si unes fuerzas con otras personas, particularmente miembros de la familia, puedes incrementar los ingresos de todo el grupo el grupo familiar o hacer un mejor uso de sus ahorros.",
    "Estás ingresando en un período de conflicto y las cosas pueden ponerse verdaderamente calientes en las semanas por venir. Los eventos recientes te han acercado a algunos miembros de la familia, y ahora tu corazón está feliz.",
    "Recuerda: los demás te llevan en su corazón dondequiera que vayan. Las cosas van a mejorar drásticamente si cambias tu dieta. Algo que comes en forma regular hace que te sientas flojo y falto de energía.",
    "Si consigues identificar y eliminar este elemento, tu vitalidad estará por las nubes.\n" +
            "Tus números de la suerte: 9, 24, 38, 49.Palabra clave de la semana: auto-expresión.\n" +
            "Aspecto más favorecido: salud.",
    "Algunos de los aspectos positivos que suelen tener aquellas personas nacidas bajo el signo de Tauro, es que ellos son una gran inspiración para muchas otras personas, y es muy común que tengan una mente brillante y una excesiva creatividad.",
    "Se sabe también que los taurinos tienen un muy buen gusto para elegir la mayoría de las cosas, y que por otra parte tienen una cierta inclinación al misticismo.",
    "La gente nacida bajo ese signo, es conocida además por tener muchos talentos artísticos. Es también muy bueno para mantener relaciones duraderas.",
    "Aquellas personas que nacen bajo este signo, tienen también la característica de ser gente que desea una vida activa y mentalmente desafiante, aunque esto no signifique que desprecien la reposada.",
    "Siempre estás en busca de calma y pacífica vida hogareña. Por eso, esta aparente calma exterior da a menudo una falsa impresión, pues Tauro tiene una tremenda fuerza interior, sensibilidad, e idealismo.",
    "Este signo también posee algunas otras características que no son tan buenas, como por ejemplo algunos malos hábitos que suelen, no obstante, guardar de forma muy reservada.",
    "Los nacidos bajo este signo tienen también un fuerte temor de enfrentar los cambios.\n" +
            "Por su parte, su positiva faceta creativa puede llevarlos a menudo a ser demasiado idealistas o auto-engañarse excesivamente.",
    "Un presupuesto apretado significa que las jornadas de compras no deben formar parte de la agenda. No obstante, tu energía creativa es alta, y puedes volver esta situación a tu favor al transformar tus posesiones existentes en artículos nuevos y originales.",
    "Tus planes financieros lucen verdaderamente bien, pero lo cierto es que podrían verse todavía mejor. Si unes fuerzas con otras personas, particularmente miembros de la familia, puedes incrementar los ingresos de todo el grupo el grupo familiar o hacer un mejor uso de sus ahorros.",
    "Estás ingresando en un período de conflicto y las cosas pueden ponerse verdaderamente calientes en las semanas por venir. Los eventos recientes te han acercado a algunos miembros de la familia, y ahora tu corazón está feliz.",
    "Recuerda: los demás te llevan en su corazón dondequiera que vayan. Las cosas van a mejorar drásticamente si cambias tu dieta. Algo que comes en forma regular hace que te sientas flojo y falto de energía.",
    "Si consigues identificar y eliminar este elemento, tu vitalidad estará por las nubes.\n" +
            "Tus números de la suerte: 9, 24, 38, 49.Palabra clave de la semana: auto-expresión.\n" +
            "Aspecto más favorecido: salud.",
    "Algunos de los aspectos positivos que suelen tener aquellas personas nacidas bajo el signo de Tauro, es que ellos son una gran inspiración para muchas otras personas, y es muy común que tengan una mente brillante y una excesiva creatividad.",
    "Se sabe también que los taurinos tienen un muy buen gusto para elegir la mayoría de las cosas, y que por otra parte tienen una cierta inclinación al misticismo.",
    "La gente nacida bajo ese signo, es conocida además por tener muchos talentos artísticos. Es también muy bueno para mantener relaciones duraderas.",
    "Aquellas personas que nacen bajo este signo, tienen también la característica de ser gente que desea una vida activa y mentalmente desafiante, aunque esto no signifique que desprecien la reposada.",
    "Siempre estás en busca de calma y pacífica vida hogareña. Por eso, esta aparente calma exterior da a menudo una falsa impresión, pues Tauro tiene una tremenda fuerza interior, sensibilidad, e idealismo.",
    "Este signo también posee algunas otras características que no son tan buenas, como por ejemplo algunos malos hábitos que suelen, no obstante, guardar de forma muy reservada.",
    "Los nacidos bajo este signo tienen también un fuerte temor de enfrentar los cambios.\n" +
            "Por su parte, su positiva faceta creativa puede llevarlos a menudo a ser demasiado idealistas o auto-engañarse excesivamente.",
    "Un nativo típico, es también una persona nerviosa, y tiene el problema de perder el control, en más de una oportunidad, de sus asuntos emocionales. La gente nacida bajo este signo tiene asimismo un fuerte temor de aquellas cuestiones que los fuercen a abandonar su rutina.",
    "Un típico nativo suele desafiar a los demás en los juegos de poder, sobre todo si su adversario es un enemigo. Pero incluso siendo amigo, es posible que Tauro lo considere un potencial rival.",
    "En los asuntos más relacionados al trabajo, este signo suele trabajar muy duro, y no parará hasta lograr sus objetivos. Típicamente, un taurino tomará el toro por las astas, y hará todo el trabajo duro que sea necesario.",
    "Los nacidos bajo este signo son muy tesoneros y emprendedores Esto hará que puedan fácilmente llegar a alcanzar sus objetivos, y logren por lo tanto escalar a posiciones de autoridad en su carrera.",
    "Para este signo, la educación es un componente esencial a para poder llegar al máximo potencial. La mayoría de las veces, la gente nacida bajo este signo tiene una fuerte necesidad por estimular su curiosidad intelectual.",
    "La gran capacidad de expresarse en palabras es una de las mejores características de estos nativos, y por lo tanto algunos de los trabajos para los que las personas nacidas bajo este signo serían ideales, serían aquellos donde ser el habla o la escritura sean las herramientas.",
    "Para desarrollar te debe buscar campos ideales, como por ejemplo el canto o la actuación, o bien como maestros o jueces, pues no hay que olvidar tampoco que este signo tiene también una alta inteligencia.",
    "En este sentido, también podrían desempeñarse bien en las inversiones, el mercado de valores, y las publicaciones. Es muy común que creen que dominan al mundo pero deben tener siempre los pies sobre la tierra.",
    "En cuestiones del corazón, suelen generalmente hacer todo lo que está a su alcance, para mantener en las relaciones una vitalidad constante, aunque a veces su faceta excesivamente crítica y arrogante puede crear algo de tensión e inquietud.",
    "Este signo disfruta estando con gente mentalmente estimulante y comparte muchos intereses en común con aquellos que elige como pareja. Ellos poseen también una naturaleza protectora, que hace sentir muy seguros, a los que están en pareja con ellos.",
    "Algunas de las cosas positivas que se encuentran bajo esta estrella, promueven, como principales características, unas mentes creativas y una gran ambición. La honestidad juega también un gran papel.",
    "Estos nativos se caracterizan por tener determinación, así como el entusiasmo de realizar las cosas. Por eso, aquellas personas nativas, son muy agraciadas con una gran inteligencia, así como también con una carismática habilidad para tratar con gente."};
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily);

        tv = (TextView)findViewById(R.id.tt);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        Random numP = new Random();

        byte ram = (byte)numP.nextInt(59);

        tv.setText(word[ram]);
    }
}
