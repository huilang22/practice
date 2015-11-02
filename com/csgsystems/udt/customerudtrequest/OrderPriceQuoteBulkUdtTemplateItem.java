/*
 * Generated code DO NOT EDIT
 * Generated file: OrderPriceQuoteBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a OrderPriceQuoteBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderPriceQuoteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BigInteger order_id;
  protected Date as_of_date;
  protected Integer account_no;
  protected Integer invoice_count;
/**
 *
 * Constructor to create a  OrderPriceQuoteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderPriceQuoteBulkUdtTemplateItem(String id, BSDMSessionContext context, BigInteger order_idIn, Date as_of_dateIn, Integer account_noIn, Integer invoice_countIn) {
    super(id, context, "OrderPriceQuote");
    order_id = order_idIn;
    as_of_date = as_of_dateIn;
    account_no = account_noIn;
    invoice_count = invoice_countIn;
  }

  public void translateToMap() {
    if (order_id != null) {
      addInput("OrderId", order_id);
    }
    if (as_of_date != null) {
      addInput("AsOfDate", as_of_date);
    }
    if (account_no != null) {
      addInput("AccountInternalId", account_no);
    }
    if (invoice_count != null) {
      addInput("InvoiceCount", invoice_count);
    }
  }


/**
 *
 * Sets the OrderId
 * @param order_idIn Value of the order_id
 *
 */

  public void setOrderId(BigInteger order_idIn) {
    order_id = order_idIn;
  }

/**
 *
 * Sets the AsOfDate
 * @param as_of_dateIn Value of the as_of_date
 *
 */

  public void setAsOfDate(Date as_of_dateIn) {
    as_of_date = as_of_dateIn;
  }

/**
 *
 * Sets the AccountInternalId
 * @param account_noIn Value of the account_no
 *
 */

  public void setAccountInternalId(Integer account_noIn) {
    account_no = account_noIn;
  }

/**
 *
 * Sets the InvoiceCount
 * @param invoice_countIn Value of the invoice_count
 *
 */

  public void setInvoiceCount(Integer invoice_countIn) {
    invoice_count = invoice_countIn;
  }

  public void translateFromMap() {
    order_id = (BigInteger)inputMap.get("OrderId");
    as_of_date = (Date)inputMap.get("AsOfDate");
    account_no = (Integer)inputMap.get("AccountInternalId");
    invoice_count = (Integer)inputMap.get("InvoiceCount");
  }

/**
 *
 * Gets the OrderId
 * @return Value of the OrderId
 *
 */

  public BigInteger getOrderId( ) {
    return order_id;
  }

/**
 *
 * Gets the AsOfDate
 * @return Value of the AsOfDate
 *
 */

  public Date getAsOfDate( ) {
    return as_of_date;
  }

/**
 *
 * Gets the AccountInternalId
 * @return Value of the AccountInternalId
 *
 */

  public Integer getAccountInternalId( ) {
    return account_no;
  }

/**
 *
 * Gets the InvoiceCount
 * @return Value of the InvoiceCount
 *
 */

  public Integer getInvoiceCount( ) {
    return invoice_count;
  }

}
