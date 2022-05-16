package com.redhat.quarkus.score.domain;
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

public class DMNRequest {

  private String city;
  private String occupation;
  private Integer age;
  private Boolean shareholder;
  private Boolean interpol;
  private String kogitoprocinstanceid;
  private String kogitoprocid;
  private String kogitousertaskist;
  private String kogitoprocrefid;
  

  public DMNRequest() {
  }

  public DMNRequest(String city, String occupation, Integer age, Boolean shareholder, Boolean interpol, String kogitoprocinstanceid, String kogitoprocid, String kogitousertaskist, String kogitoprocrefid) {
    this.city = city;
    this.occupation = occupation;
    this.age = age;
    this.shareholder = shareholder;
    this.interpol = interpol;
    this.kogitoprocinstanceid = kogitoprocinstanceid;
    this.kogitoprocid = kogitoprocid;
    this.kogitousertaskist = kogitousertaskist;
    this.kogitoprocrefid = kogitoprocrefid;
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

  public Integer getAge() {
    return this.age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Boolean isShareholder() {
    return this.shareholder;
  }

  public Boolean getShareholder() {
    return this.shareholder;
  }

  public void setShareholder(Boolean shareholder) {
    this.shareholder = shareholder;
  }

  public Boolean isInterpol() {
    return this.interpol;
  }

  public Boolean getInterpol() {
    return this.interpol;
  }

  public void setInterpol(Boolean interpol) {
    this.interpol = interpol;
  }

  public String getKogitoprocinstanceid() {
    return this.kogitoprocinstanceid;
  }

  public void setKogitoprocinstanceid(String kogitoprocinstanceid) {
    this.kogitoprocinstanceid = kogitoprocinstanceid;
  }

  public String getKogitoprocid() {
    return this.kogitoprocid;
  }

  public void setKogitoprocid(String kogitoprocid) {
    this.kogitoprocid = kogitoprocid;
  }

  public String getKogitousertaskist() {
    return this.kogitousertaskist;
  }

  public void setKogitousertaskist(String kogitousertaskist) {
    this.kogitousertaskist = kogitousertaskist;
  }

  public String getKogitoprocrefid() {
    return this.kogitoprocrefid;
  }

  public void setKogitoprocrefid(String kogitoprocrefid) {
    this.kogitoprocrefid = kogitoprocrefid;
  }

  @Override
  public String toString() {
    return "{" +
      " city='" + getCity() + "'" +
      ", occupation='" + getOccupation() + "'" +
      ", age='" + getAge() + "'" +
      ", shareholder='" + isShareholder() + "'" +
      ", interpol='" + isInterpol() + "'" +
      ", kogitoprocinstanceid='" + getKogitoprocinstanceid() + "'" +
      ", kogitoprocid='" + getKogitoprocid() + "'" +
      ", kogitousertaskist='" + getKogitousertaskist() + "'" +
      ", kogitoprocrefid='" + getKogitoprocrefid() + "'" +
      "}";
  }

}
