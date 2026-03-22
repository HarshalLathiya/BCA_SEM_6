import matplotlib.pyplot as plt
import seaborn as sns
import pandas as pd

data = pd.read_csv("data.csv")

plt.figure()
data['Age'].hist()
plt.title("Age Distribution")
plt.show()

sns.boxplot(x=data['Salary'])
plt.show()
