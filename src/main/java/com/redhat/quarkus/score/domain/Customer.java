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

public class Customer {

  private String name;
  private String cpf;
  private Double income;
  private boolean processed;

  public Customer() {

  }

  public Customer(String name, String cpf, Double income, boolean processed) {
    this.name = name;
    this.cpf = cpf;
    this.income = income;
    this.processed = processed;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Double getIncome() {
    return income;
  }

  public void setIncome(Double income) {
    this.income = income;
  }

  public boolean getProcessed() {
    return processed;
  }

  public void setProcessed(boolean processed) {
    this.processed = processed;
  }

  @Override
  public String toString() {
    return "{\"name\":\"" + name + "\",\"cpf\":\"" + cpf + "\",\"income\":" + income + "\",\"processed\":" + processed
        + "}";
  }

}