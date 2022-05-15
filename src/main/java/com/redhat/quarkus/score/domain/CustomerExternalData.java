/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.redhat.quarkus.score.domain;

public class CustomerExternalData {
  
  private String city;
  private String occupation;
  private int age;
  private boolean shareholder;
  private boolean interpol;

  public CustomerExternalData() {
  }

  public CustomerExternalData(String city, String occupation, int age, boolean shareholder, boolean interpol) {
    this.city = city;
    this.occupation = occupation;
    this.age = age;
    this.shareholder = shareholder;
    this.interpol = interpol;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getOccupation() {
    return this.occupation;
  }

  public void setOccupation(String occupation) {
    this.occupation = occupation;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean isShareholder() {
    return this.shareholder;
  }

  public boolean getShareholder() {
    return this.shareholder;
  }

  public void setShareholder(boolean shareholder) {
    this.shareholder = shareholder;
  }

  public boolean isInterpol() {
    return this.interpol;
  }

  public boolean getInterpol() {
    return this.interpol;
  }

  public void setInterpol(boolean interpol) {
    this.interpol = interpol;
  }

  @Override
  public String toString() {
    return "{\"city\":\"" + city
        + "\",\"occupation\":\"" + occupation
        + "\",\"age\":" + age
        + ",\"shareholder\":" + shareholder
        + ",\"interpol\":" + interpol + "}";
  }
}
