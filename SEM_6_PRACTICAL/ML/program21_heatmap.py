import seaborn as sns
import matplotlib.pyplot as plt
import pandas as pd

data = pd.read_csv("data.csv")
corr = data.corr()

sns.heatmap(corr, annot=True)
plt.show()
