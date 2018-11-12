	Day=`date +%d`
	Dir=/bv_data/bv_app/GojekApp
	Log=/bv_data/bv_app/GojekApp/logs/GojekApp.log	
	
	cd $Dir

	if [ $Day -eq 15 ] ; then
		mv $Log $Log.backup
		echo "Log cleaned on " `date` > $Log
	fi

	cd $Dir
	touch $Log
	echo >> $Log
	echo "=============== START PROCESSING :: " `date` " =============== " >> $Log
	echo >> $Log

	echo Killing existing processes...
	ps -ef| grep GojekApp 2>/dev/null 1>/dev/null

	if [ $? -eq 0 ] ; then
		ps -ef| grep GojekApp | cut -c10-15 | xargs kill -9
	fi

	echo Running...

	###############################################################################
	java -jar GojekApp.jar /bv_data/bv_app/GojekApp/input_file.txt 1>>$Log 2>>$Log

	###############################################################################

	echo >> $Log
	echo "===============  END PROCESSING  :: " `date` " =============== " >> $Log
