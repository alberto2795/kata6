package kata6;


import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay<T> extends ApplicationFrame {

    private final Histogram<T> histo;
    private final String nameEjeX;

    public HistogramDisplay(Histogram<T> histo, String nameEjeX) {
        super("Histograma");
        this.nameEjeX = nameEjeX;
        this.histo = histo;
        setContentPane(createPanel());
        pack();
    }

    private ChartPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500, 400));
        return chartPanel;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart(null, nameEjeX, "Nº Emails",
                dataset, PlotOrientation.VERTICAL,
                false, false, false);
        return chart;
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (T key : histo.keySet()) {
            dataset.addValue(histo.get(key), "", (Comparable) key);
        }
        return dataset;
    }

    public void exectute() {
        this.setVisible(true);
    }
}