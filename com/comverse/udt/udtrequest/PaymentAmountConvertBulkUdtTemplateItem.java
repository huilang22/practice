/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentAmountConvertBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a PaymentAmountConvertBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentAmountConvertBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer charge_type;
  protected Date conversion_date;
  protected Integer currency_code;
  protected Integer exrate_class;
  protected BigInteger external_amount;
  protected Integer external_currency;
/**
 *
 * Constructor to create a  PaymentAmountConvertBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentAmountConvertBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer charge_typeIn, Date conversion_dateIn, Integer currency_codeIn, Integer exrate_classIn, BigInteger external_amountIn, Integer external_currencyIn) {
    super(id, context, "PaymentAmountConvert");
    charge_type = charge_typeIn;
    conversion_date = conversion_dateIn;
    currency_code = currency_codeIn;
    exrate_class = exrate_classIn;
    external_amount = external_amountIn;
    external_currency = external_currencyIn;
  }

  public void translateToMap() {
    if (charge_type != null) {
      addInput("ChargeType", charge_type);
    }
    if (conversion_date != null) {
      addInput("ConversionDate", conversion_date);
    }
    if (currency_code != null) {
      addInput("CurrencyCode", currency_code);
    }
    if (exrate_class != null) {
      addInput("ExrateClass", exrate_class);
    }
    if (external_amount != null) {
      addInput("ExternalAmount", external_amount);
    }
    if (external_currency != null) {
      addInput("ExternalCurrency", external_currency);
    }
  }


/**
 *
 * Sets the ChargeType
 * @param charge_typeIn Value of the charge_type
 *
 */

  public void setChargeType(Integer charge_typeIn) {
    charge_type = charge_typeIn;
  }

/**
 *
 * Sets the ConversionDate
 * @param conversion_dateIn Value of the conversion_date
 *
 */

  public void setConversionDate(Date conversion_dateIn) {
    conversion_date = conversion_dateIn;
  }

/**
 *
 * Sets the CurrencyCode
 * @param currency_codeIn Value of the currency_code
 *
 */

  public void setCurrencyCode(Integer currency_codeIn) {
    currency_code = currency_codeIn;
  }

/**
 *
 * Sets the ExrateClass
 * @param exrate_classIn Value of the exrate_class
 *
 */

  public void setExrateClass(Integer exrate_classIn) {
    exrate_class = exrate_classIn;
  }

/**
 *
 * Sets the ExternalAmount
 * @param external_amountIn Value of the external_amount
 *
 */

  public void setExternalAmount(BigInteger external_amountIn) {
    external_amount = external_amountIn;
  }

/**
 *
 * Sets the ExternalCurrency
 * @param external_currencyIn Value of the external_currency
 *
 */

  public void setExternalCurrency(Integer external_currencyIn) {
    external_currency = external_currencyIn;
  }

  public void translateFromMap() {
    charge_type = (Integer)inputMap.get("ChargeType");
    conversion_date = (Date)inputMap.get("ConversionDate");
    currency_code = (Integer)inputMap.get("CurrencyCode");
    exrate_class = (Integer)inputMap.get("ExrateClass");
    external_amount = (BigInteger)inputMap.get("ExternalAmount");
    external_currency = (Integer)inputMap.get("ExternalCurrency");
  }

/**
 *
 * Gets the ChargeType
 * @return Value of the ChargeType
 *
 */

  public Integer getChargeType( ) {
    return charge_type;
  }

/**
 *
 * Gets the ConversionDate
 * @return Value of the ConversionDate
 *
 */

  public Date getConversionDate( ) {
    return conversion_date;
  }

/**
 *
 * Gets the CurrencyCode
 * @return Value of the CurrencyCode
 *
 */

  public Integer getCurrencyCode( ) {
    return currency_code;
  }

/**
 *
 * Gets the ExrateClass
 * @return Value of the ExrateClass
 *
 */

  public Integer getExrateClass( ) {
    return exrate_class;
  }

/**
 *
 * Gets the ExternalAmount
 * @return Value of the ExternalAmount
 *
 */

  public BigInteger getExternalAmount( ) {
    return external_amount;
  }

/**
 *
 * Gets the ExternalCurrency
 * @return Value of the ExternalCurrency
 *
 */

  public Integer getExternalCurrency( ) {
    return external_currency;
  }

}
