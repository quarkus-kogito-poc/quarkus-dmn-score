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

public class DMNResponse {

  private String cityTable;
  private String occupationTable;
  private String shareholderTable;
  private Integer customerScore;
  private Boolean customerSuspectResult;
  private String kogitoprocinstanceid;
  private String kogitoprocid;
  private String kogitousertaskist;


  public DMNResponse() {
  }

  public DMNResponse(String cityTable, String occupationTable, String shareholderTable, Integer customerScore, Boolean customerSuspectResult, String kogitoprocinstanceid, String kogitoprocid, String kogitousertaskist) {
    this.cityTable = cityTable;
    this.occupationTable = occupationTable;
    this.shareholderTable = shareholderTable;
    this.customerScore = customerScore;
    this.customerSuspectResult = customerSuspectResult;
    this.kogitoprocinstanceid = kogitoprocinstanceid;
    this.kogitoprocid = kogitoprocid;
    this.kogitousertaskist = kogitousertaskist;
  }

  public String getCityTable() {
    return this.cityTable;
  }

  public void setCityTable(String cityTable) {
    this.cityTable = cityTable;
  }

  public String getOccupationTable() {
    return this.occupationTable;
  }

  public void setOccupationTable(String occupationTable) {
    this.occupationTable = occupationTable;
  }

  public String getShareholderTable() {
    return this.shareholderTable;
  }

  public void setShareholderTable(String shareholderTable) {
    this.shareholderTable = shareholderTable;
  }

  public Integer getCustomerScore() {
    return this.customerScore;
  }

  public void setCustomerScore(Integer customerScore) {
    this.customerScore = customerScore;
  }

  public Boolean isCustomerSuspectResult() {
    return this.customerSuspectResult;
  }

  public Boolean getCustomerSuspectResult() {
    return this.customerSuspectResult;
  }

  public void setCustomerSuspectResult(Boolean customerSuspectResult) {
    this.customerSuspectResult = customerSuspectResult;
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

  @Override
  public String toString() {
    return "{" +
      " cityTable='" + getCityTable() + "'" +
      ", occupationTable='" + getOccupationTable() + "'" +
      ", shareholderTable='" + getShareholderTable() + "'" +
      ", customerScore='" + getCustomerScore() + "'" +
      ", customerSuspectResult='" + isCustomerSuspectResult() + "'" +
      ", kogitoprocinstanceid='" + getKogitoprocinstanceid() + "'" +
      ", kogitoprocid='" + getKogitoprocid() + "'" +
      ", kogitousertaskist='" + getKogitousertaskist() + "'" +
      "}";
  }


}