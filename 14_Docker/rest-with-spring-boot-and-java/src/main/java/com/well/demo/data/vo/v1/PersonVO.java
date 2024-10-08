package com.well.demo.data.vo.v1;

import java.io.Serializable;

import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"id","firstName","lastName","adress","gender"})
public class PersonVO  extends RepresentationModel<PersonVO> implements Serializable {

		private static final long serialVersionUID = 1L;
		
		@JsonProperty("id")
		private long key;
		private String firstName;
		private String lastName;
		private String address;
		private String gender;
		private boolean enabled;

		
		public PersonVO() {}


		public String getFirstName() {
			return firstName;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		public String getGender() {
			return gender;
		}


		public void setGender(String gender) {
			this.gender = gender;
		}


		public long getKey() {
			return key;
		}


		public void setKey(long key) {
			this.key = key;
		}
		


		public boolean isEnabled() {
			return enabled;
		}


		public void setEnable(boolean enabled) {
			this.enabled = enabled;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + ((address == null) ? 0 : address.hashCode());
			result = prime * result + (enabled ? 1231 : 1237);
			result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
			result = prime * result + ((gender == null) ? 0 : gender.hashCode());
			result = prime * result + (int) (key ^ (key >>> 32));
			result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
			return result;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			PersonVO other = (PersonVO) obj;
			if (address == null) {
				if (other.address != null)
					return false;
			} else if (!address.equals(other.address))
				return false;
			if (enabled != other.enabled)
				return false;
			if (firstName == null) {
				if (other.firstName != null)
					return false;
			} else if (!firstName.equals(other.firstName))
				return false;
			if (gender == null) {
				if (other.gender != null)
					return false;
			} else if (!gender.equals(other.gender))
				return false;
			if (key != other.key)
				return false;
			if (lastName == null) {
				if (other.lastName != null)
					return false;
			} else if (!lastName.equals(other.lastName))
				return false;
			return true;
		}


		


		
}
