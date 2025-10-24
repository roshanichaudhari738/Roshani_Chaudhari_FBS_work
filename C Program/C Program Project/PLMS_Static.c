#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct Player
{
	int JerseyNo;
	char Name[50];
	int Runs;
	int Wickets;
	int Matches;
}Player;

void defaultPlayers();
void displayAllPlayer();
void addPlayer();
void searchPlayer();
void updatePlayer();
void removePlayer();
void sortPlayer();
void topPlayer();

void main()
{
	Player *players;
	players=(Player*)malloc(10*sizeof(Player));
	
	int count=0;
	defaultPlayers(players,&count);
	int choice;
	
	while(1)
	{
		printf("\n********* Player Management System *********\n\n");
		printf("1.Add Player\n");	
		printf("2.Remove Player\n");
		printf("3.Search Player\n");
		printf("4.Update Player\n");
		printf("5.Display all Player\n");
		printf("6.Sorted Player\n");
		printf("7.Top 3 Player\n");
		printf("8.Exit\n");
		
		printf("Enter your choice:-");
		scanf("%d",&choice);
		
		switch(choice)
		{
			case 1:	
				addPlayer(players,&count);
			break;
			
			case 2:	
				removePlayer(players,&count);
			break;
			
			case 3:	
				searchPlayer(players,count);
			break;
			
			case 4:	
				updatePlayer(players,count);
			break;
			
			case 5:	
				displayAllPlayer(players,count);
			break;
			
			case 6:	
				sortPlayer(players,count);
			break;
			
			case 7:	
				topPlayer(players,count);
			break;
			
			case 8:	
				free(players);
				printf("Exiting Program");
				exit(0);
			break;
				
			default:printf("Invalid choice!!!\n");
		}
		
	}
}

void defaultPlayers(Player players[],int *count)
{
	*count=6;

		players[0]=(Player){10,"Dhoni",1000,100,100};
		players[1]=(Player){12,"Virat",100,50,50};
		players[2]=(Player){13,"Rohit",500,20,30};
		players[3]=(Player){14,"Jasprit",8000,30,800};
		players[4]=(Player){45,"Yuvraj",12000,8900,789};
		players[5]=(Player){60,"Sachin",800,6300,852};
	
}

void addPlayer(Player players[],int *count)
{
	players=realloc(players,(*count+1) * sizeof(Player));
	
	printf("\nEnter the Jersey No:");
	scanf("%d",&players[*count].JerseyNo);
	
	printf("\nEnter the Name:");
	scanf("%s",&players[*count].Name);
	
	printf("\nEnter the Run:");
	scanf("%d",&players[*count].Runs);
	
	printf("\nEnter the Wicket:");
	scanf("%d",&players[*count].Wickets);
	
	printf("\nEnter the Match:");
	scanf("%d",&players[*count].Matches);
	
	printf("\nSuccessfully add the player!!!!\n");
	(*count)++;	
}

void displayAllPlayer(Player players[],int size)
{
	printf("\n******** Player Details ********\n\n");
	for(int i=0;i<size;i++)
	{
		printf("Jersry No: %d | Name: %s | Runs: %d | Wickets: %d | Matches: %d \n",
		players[i].JerseyNo,players[i].Name,players[i].Runs,players[i].Wickets,players[i].Matches);
	}
}

void searchPlayer(Player players[],int count)
{
	printf("\n******** Search Player Details ********\n\n");
	int ch;
	printf("Search By:\n");
	printf("1.Jersey No\n");
	printf("2.Name\n");
	printf("Enter you want to choice:");
	scanf("%d",&ch);
	
	if(ch==1)
	{
		int jno;
		printf("search by the Jersey No:");
		scanf("%d",&jno);
		for(int i=0;i<count;i++)
		{
			if(players[i].JerseyNo==jno)
			{
				printf("Record Found\n");
				printf("JerseyNo :%d Name :%s Runs :%d Wicket :%d Match :%d\n",
				players[i].JerseyNo,players[i].Name,players[i].Runs,players[i].Wickets,players[i].Matches);
				return;
			}
				
		}
		printf("Record Not Found\n");
		
	}
	else if(ch==2)
	{
		char jname[20];
		printf("Search by Name:");
		scanf("%s",&jname);
		for(int i=0;i<count;i++)
		{
			if(strcmp(players[i].Name,jname)==0)
			{
				printf("Record Found\n");
				printf("JerseyNo :%d Name :%s Runs :%d Wicket :%d Match :%d\n",
				players[i].JerseyNo,players[i].Name,players[i].Runs,players[i].Wickets,players[i].Matches);
				return;
			}
		}
		printf("Record Not Found\n");
	}
	else{
		printf("Invalid choice!!!\n");
	}
}

void updatePlayer(Player players[],int count)
{
	int jno;
	printf("Enter the Player Jersey no:\n");
	scanf("%d",&jno);
	for(int i=0;i<count;i++)
	{
		if(players[i].JerseyNo==jno)
		{
			printf("Choose the Update Column name\n");
			printf("1.Name\n");
			printf("2.Runs\n");
			printf("3.Wicket\n");
			printf("4.Matche\n");
			printf("5.All\n");
			
			int ch;
			printf("Enter the choice you want to update:\n");
			scanf("%d",&ch);
			if(ch==1)
			{
				printf("Enter the Updated Name:");
				scanf("%s",&players[i].Name);
				printf("\nPlayer Name update successfully!!!!!\n");
				return;
			}
			else if(ch==2)
			{
				printf("Enter the updated Run:");
				scanf("%d",&players[i].Runs);
				printf("\nPlayer Run update successfully!!!!!\n");
				return;
			}
			else if(ch==3)
			{
				printf("Enter the updated Wicket:");
				scanf("%d",&players[i].Wickets);
				printf("\nPlayer Wickets update successfully!!!!!\n");
				return;
			}
			else if(ch==4)
			{
				printf("Enter the updated Matche:");
				scanf("%d",&players[i].Matches);
				printf("Player Matches update successfully!!!!!\n");
				return;
			}
			else if(ch==5)
			{
				printf("Enter the Updated Name:");
				scanf("%s",&players[i].Name);
				
				printf("Enter the updated Run:");
				scanf("%d",&players[i].Runs);
			
				printf("Enter the updated Wicket:");
				scanf("%d",&players[i].Wickets);
			
				printf("Enter the updated Matche:");
				scanf("%d",&players[i].Matches);
			
				printf("\nPlayer update successfully!!!!!\n");
				return;
			}
			else
			{
				printf("Invalid choice!!!\n");
			}
		}
	}
	printf("Player not found!!!");
}

void removePlayer(Player players[],int *count)
{
	int jno;
	printf("Enter the Player Jersey no:\n");
	scanf("%d",&jno);
	int index=-1;
	for(int i=0;i<*count;i++)
	{	
		if(players[i].JerseyNo==jno)
		{
			index=i;
			break;
		}
	}
		
	if(index==-1)
	{
		printf("Player record not found\n");
	}
		
	for(int i=index;i<*count-1;i++)
	{
		players[i]=players[i+1];
	}
	
	(*count)--;
	players=realloc(players,(*count) * sizeof(Player));
	
	printf("Player Deleted Successfully!!!\n");	
}

void sortPlayer(Player players[],int count)
{
	int ch;
	printf("Sort by:\n");
	printf("1.Runs Minimum to Maximum\n");
	printf("2.Runs Maximum to Minimum\n");
	printf("3.Wicket Minimum to Maximum\n");
	printf("4.Wicket Maximum to Minimum\n");
	printf("Enter the choice for sort:\n");
	scanf("%d",&ch);
	
	if(ch==1)
	{
		Player temp;
		for(int i=0;i<count-1;i++)
		{
			for(int j=i+1;j<count;j++)
			{
				if(players[i].Runs>players[j].Runs)
				{
				
					temp=players[i];
					players[i]=players[j];
					players[j]=temp;
				}
			}
		}
		displayAllPlayer(players,count);
		printf("\nSorted Minimum to Maximum Player successfully\n");
	}
	else if(ch==2)
	{
		Player temp;
		for(int i=0;i<count-1;i++)
		{
			for(int j=i+1;j<count;j++)
			{
				if(players[i].Runs<players[j].Runs)
				{
				
					temp=players[i];
					players[i]=players[j];
					players[j]=temp;
				}
			}
		}
		displayAllPlayer(players,count);
		printf("\nSorted Maximum to Minimum Player successfully\n");
	}
	
	else if(ch==3)
	{
		Player temp;
		for(int i=0;i<count-1;i++)
		{
			for(int j=i+1;j<count;j++)
			{
				if(players[i].Wickets>players[j].Wickets)
				{
				
					temp=players[i];
					players[i]=players[j];
					players[j]=temp;
				}
			}
		}
		displayAllPlayer(players,count);
		printf("\nSorted Minimum to Maximum Player successfully\n");
	}
	else if(ch==4)
	{
		Player temp;
		for(int i=0;i<count-1;i++)
		{
			for(int j=i+1;j<count;j++)
			{
				if(players[i].Wickets<players[j].Wickets)
				{
				
					temp=players[i];
					players[i]=players[j];
					players[j]=temp;
				}
			}
		}
		displayAllPlayer(players,count);
		printf("\nSorted Maximum to Minimum Player successfully\n");
	}
	else{
		printf("Invalid Choice !!!\n");
		printf("Enter the valid Choice !!!\n");
	}
}

void topPlayer(Player players[],int count)
{
	int ch;
	printf("Choose Top3 Players:\n");
	printf("1.Top3 Run \n");
	printf("2.Top3 Wicket \n");
	printf("3.Top3 Matches \n");
	printf("Enter the Choice:");
	scanf("%d",&ch);
	
	if(ch==1)
	{
		Player temp;
		for(int i=0;i<count-1;i++)
		{
			for(int j=i+1;j<count;j++)
			{
				if(players[i].Runs<players[j].Runs)
				{
					temp=players[i];
					players[i]=players[j];
					players[j]=temp;
				}
			}
		}
		printf("Top3 Run:\n");
		for(int i=0;i<count;i++)
		{
			if(i<3)
			{
				
				printf("Jersry No: %d | Name: %s | Runs: %d | Wickets: %d | Matches: %d \n",
				players[i].JerseyNo,players[i].Name,players[i].Runs,players[i].Wickets,players[i].Matches);
			}
		}
	}
	else if(ch==2)
	{
		Player temp;
		for(int i=0;i<count-1;i++)
		{
			for(int j=i+1;j<count;j++)
			{
				if(players[i].Wickets<players[j].Wickets)
				{
					temp=players[i];
					players[i]=players[j];
					players[j]=temp;
				}
			}
		}
		printf("Top3 Wickets:\n");
		for(int i=0;i<count;i++)
		{
			if(i<3)
			{	
				printf("Jersry No: %d | Name: %s | Runs: %d | Wickets: %d | Matches: %d \n",
				players[i].JerseyNo,players[i].Name,players[i].Runs,players[i].Wickets,players[i].Matches);
			}	
		}
	}
	else if(ch==3)
	{
		Player temp;
		for(int i=0;i<count-1;i++)
		{
			for(int j=i+1;j<count;j++)
			{
				if(players[i].Matches<players[j].Matches)
				{
					temp=players[i];
					players[i]=players[j];
					players[j]=temp;
				}
			}
		}
		printf("Top3 Matches:\n");
		for(int i=0;i<count;i++)
		{
			if(i<3)
			{
				
				printf("Jersry No: %d | Name: %s | Runs: %d | Wickets: %d | Matches: %d \n",
				players[i].JerseyNo,players[i].Name,players[i].Runs,players[i].Wickets,players[i].Matches);
			}	
		}
	}
	else{
		printf("Invalid Choice !!!\n");
		printf("Enter the valid Choice !!!\n");
	}
}