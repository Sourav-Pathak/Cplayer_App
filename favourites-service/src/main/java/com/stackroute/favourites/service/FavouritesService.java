package com.stackroute.favourites.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.favourites.model.Favourites;
import com.stackroute.favourites.repository.FavouritesRepository;

@Service
public class FavouritesService implements FavouritesServiceDeclaration{

	@Autowired
	private FavouritesRepository favouritesRepository;

	//To get the user details by using username
	public List<Favourites> getAllData(String username) {
		return (List<Favourites>) favouritesRepository.findByUsername(username);
	}

	//To add player data to the database and checking whether the data is already exists in database or not
	public boolean addData(Favourites favs) {
		
		try {
			
			System.out.print("Check :---- "+favs);
			
//			favouritesRepository.save(favs);
			String pidnew = favs.getId() ;
			String usernamenew = favs.getUsername();
//			List<Favourites> list = (List<Favourites>) favouritesRepository.findAll();
			List<Favourites> list = favouritesRepository.findByUsername(usernamenew);
			System.out.print("Check :---- "+list.size());
			System.out.print("Check :---- "+list);
			boolean ans = false;
			for (Favourites temp : list) {
				
				if((temp.getId().equals(pidnew))) {
					ans = true;
					break;
				}
			}
			
			if(!ans) {
				favouritesRepository.save(favs);	
			}
			
			return ans;
		} catch (Exception e) {
			return false;
		}
	}

	//This method is called when user deletes the account
	public boolean removeData(String username) {
		try {
			List<Favourites> list = favouritesRepository.findByUsername(username);
			for (Favourites temp : list) {
				favouritesRepository.deleteById(temp.getPrimaryKey());
			}
			return true;
		} catch (Exception e) {
			System.out.println("no");
			return false;
		}
	}

	//This method is called when user clicks on unfavourite button
	public boolean removeUserData(String username, String id) {
		try {
			List<Favourites> list = favouritesRepository.findByUsername(username);
			for(Favourites temp : list ) {
				if(temp.getId().equals(id)) {
					favouritesRepository.deleteById(temp.getPrimaryKey());
					return true;
				}
			}
			return false;	
		}catch (Exception e) {
			return false;
		}
	}
}
