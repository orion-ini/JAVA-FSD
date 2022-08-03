package operation;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;

class UpdateFile {

	public static void main(String data[])
	{
        try {

			String newName = data[0];
            long newNumber = Long.parseLong(data[1]);
            String nameNumberString;
			String name;
			long number;
			int index;

			
			File file = new File("friendsContact.txt");
                if (!file.exists()) {

				
				file.createNewFile();
			}

		
			RandomAccessFile raf
				= new RandomAccessFile(file, "rw");
			boolean found = false;

			
			while (raf.getFilePointer() < raf.length()) {

				
				nameNumberString = raf.readLine();

				
				String[] lineSplit
					= nameNumberString.split("!");

				
				name = lineSplit[0];
				number = Long.parseLong(lineSplit[1]);

				
				if (name == newName
					|| number == newNumber) {
					found = true;
					break;
				}
			}

			
			if (found == true) {

				
				File tmpFile = new File("temp.txt");

				
				RandomAccessFile tmpraf
					= new RandomAccessFile(tmpFile, "rw");

				
				raf.seek(0);

				while (raf.getFilePointer()
					< raf.length()) {

				
					nameNumberString = raf.readLine();

					index = nameNumberString.indexOf('!');
					name = nameNumberString.substring(
						0, index);

					
					if (name.equals(inputName)) {

						// Update the number of this contact
						nameNumberString
							= name + "!"
							+ String.valueOf(newNumber);
					}

					
					tmpraf.writeBytes(nameNumberString);

					tmpraf.writeBytes(
						System.lineSeparator());
				}

				
				raf.seek(0);
				tmpraf.seek(0);

				
				while (tmpraf.getFilePointer()
					< tmpraf.length()) {
					raf.writeBytes(tmpraf.readLine());
					raf.writeBytes(System.lineSeparator());
				}

				
				raf.setLength(tmpraf.length());

				
				tmpraf.close();
				raf.close();

				
				tmpFile.delete();

				System.out.println(" Friend updated. ");
			}

			
			else {

				
				raf.close();

				
				System.out.println(" Input name"
								+ " does not exists. ");
			}
		}

		catch (IOException ioe) {
			System.out.println(ioe);
		}

		catch (NumberFormatException nef) {
			System.out.println(nef);
		}
	}
}

