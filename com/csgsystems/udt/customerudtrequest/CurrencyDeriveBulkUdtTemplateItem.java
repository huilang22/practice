/*
 * Generated code DO NOT EDIT
 * Generated file: CurrencyDeriveBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a CurrencyDeriveBulkUdtTemplateItem Bulk Template
 *
 */

public class CurrencyDeriveBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer account_currency_code;
  protected Integer bill_country_code;
  protected Integer cust_country_code;
  protected Integer service_currency_code;
  protected Integer service_country_code;
  protected Integer b_service_country_code;
  protected Integer type_code;
  protected Integer subtype_code;
/**
 *
 * Constructor to create a  CurrencyDeriveBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CurrencyDeriveBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer account_currency_codeIn, Integer bill_country_codeIn, Integer cust_country_codeIn, Integer service_currency_codeIn, Integer service_country_codeIn, Integer b_service_country_codeIn, Integer type_codeIn, Integer subtype_codeIn) {
    super(id, context, "CurrencyDerive");
    account_currency_code = account_currency_codeIn;
    bill_country_code = bill_country_codeIn;
    cust_country_code = cust_country_codeIn;
    service_currency_code = service_currency_codeIn;
    service_country_code = service_country_codeIn;
    b_service_country_code = b_service_country_codeIn;
    type_code = type_codeIn;
    subtype_code = subtype_codeIn;
  }

  public void translateToMap() {
    if (account_currency_code != null) {
      addInput("AccountCurrencyCode", account_currency_code);
    }
    if (bill_country_code != null) {
      addInput("BillCountryCode", bill_country_code);
    }
    if (cust_country_code != null) {
      addInput("CustCountryCode", cust_country_code);
    }
    if (service_currency_code != null) {
      addInput("ServiceCurrencyCode", service_currency_code);
    }
    if (service_country_code != null) {
      addInput("ServiceCountryCode", service_country_code);
    }
    if (b_service_country_code != null) {
      addInput("BServiceCountryCode", b_service_country_code);
    }
    if (type_code != null) {
      addInput("TypeCode", type_code);
    }
    if (subtype_code != null) {
      addInput("SubtypeCode", subtype_code);
    }
  }


/**
 *
 * Sets the AccountCurrencyCode
 * @param account_currency_codeIn Value of the account_currency_code
 *
 */

  public void setAccountCurrencyCode(Integer account_currency_codeIn) {
    account_currency_code = account_currency_codeIn;
  }

/**
 *
 * Sets the BillCountryCode
 * @param bill_country_codeIn Value of the bill_country_code
 *
 */

  public void setBillCountryCode(Integer bill_country_codeIn) {
    bill_country_code = bill_country_codeIn;
  }

/**
 *
 * Sets the CustCountryCode
 * @param cust_country_codeIn Value of the cust_country_code
 *
 */

  public void setCustCountryCode(Integer cust_country_codeIn) {
    cust_country_code = cust_country_codeIn;
  }

/**
 *
 * Sets the ServiceCurrencyCode
 * @param service_currency_codeIn Value of the service_currency_code
 *
 */

  public void setServiceCurrencyCode(Integer service_currency_codeIn) {
    service_currency_code = service_currency_codeIn;
  }

/**
 *
 * Sets the ServiceCountryCode
 * @param service_country_codeIn Value of the service_country_code
 *
 */

  public void setServiceCountryCode(Integer service_country_codeIn) {
    service_country_code = service_country_codeIn;
  }

/**
 *
 * Sets the BServiceCountryCode
 * @param b_service_country_codeIn Value of the b_service_country_code
 *
 */

  public void setBServiceCountryCode(Integer b_service_country_codeIn) {
    b_service_country_code = b_service_country_codeIn;
  }

/**
 *
 * Sets the TypeCode
 * @param type_codeIn Value of the type_code
 *
 */

  public void setTypeCode(Integer type_codeIn) {
    type_code = type_codeIn;
  }

/**
 *
 * Sets the SubtypeCode
 * @param subtype_codeIn Value of the subtype_code
 *
 */

  public void setSubtypeCode(Integer subtype_codeIn) {
    subtype_code = subtype_codeIn;
  }

  public void translateFromMap() {
    account_currency_code = (Integer)inputMap.get("AccountCurrencyCode");
    bill_country_code = (Integer)inputMap.get("BillCountryCode");
    cust_country_code = (Integer)inputMap.get("CustCountryCode");
    service_currency_code = (Integer)inputMap.get("ServiceCurrencyCode");
    service_country_code = (Integer)inputMap.get("ServiceCountryCode");
    b_service_country_code = (Integer)inputMap.get("BServiceCountryCode");
    type_code = (Integer)inputMap.get("TypeCode");
    subtype_code = (Integer)inputMap.get("SubtypeCode");
  }

/**
 *
 * Gets the AccountCurrencyCode
 * @return Value of the AccountCurrencyCode
 *
 */

  public Integer getAccountCurrencyCode( ) {
    return account_currency_code;
  }

/**
 *
 * Gets the BillCountryCode
 * @return Value of the BillCountryCode
 *
 */

  public Integer getBillCountryCode( ) {
    return bill_country_code;
  }

/**
 *
 * Gets the CustCountryCode
 * @return Value of the CustCountryCode
 *
 */

  public Integer getCustCountryCode( ) {
    return cust_country_code;
  }

/**
 *
 * Gets the ServiceCurrencyCode
 * @return Value of the ServiceCurrencyCode
 *
 */

  public Integer getServiceCurrencyCode( ) {
    return service_currency_code;
  }

/**
 *
 * Gets the ServiceCountryCode
 * @return Value of the ServiceCountryCode
 *
 */

  public Integer getServiceCountryCode( ) {
    return service_country_code;
  }

/**
 *
 * Gets the BServiceCountryCode
 * @return Value of the BServiceCountryCode
 *
 */

  public Integer getBServiceCountryCode( ) {
    return b_service_country_code;
  }

/**
 *
 * Gets the TypeCode
 * @return Value of the TypeCode
 *
 */

  public Integer getTypeCode( ) {
    return type_code;
  }

/**
 *
 * Gets the SubtypeCode
 * @return Value of the SubtypeCode
 *
 */

  public Integer getSubtypeCode( ) {
    return subtype_code;
  }

}
