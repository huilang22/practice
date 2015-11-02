/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderQuoteQuotePriceBulkUdtTemplateItem.java
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
 * Class used to create a OrderQuoteQuotePriceBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderQuoteQuotePriceBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ChargeElementObjectData[] oqqpChargesIn;
  protected Date asOfDate;
  protected Integer accountNo;
  protected Integer invoiceCount;
/**
 *
 * Constructor to create a  OrderQuoteQuotePriceBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderQuoteQuotePriceBulkUdtTemplateItem(String id, BSDMSessionContext context, ChargeElementObjectData[] oqqpChargesInIn, Date asOfDateIn, Integer accountNoIn, Integer invoiceCountIn) {
    super(id, context, "OrderQuoteQuotePrice");
    oqqpChargesIn = oqqpChargesInIn;
    asOfDate = asOfDateIn;
    accountNo = accountNoIn;
    invoiceCount = invoiceCountIn;
  }

  public void translateToMap() {
    if (oqqpChargesIn != null) {
      if (oqqpChargesIn != null) {
        Object[] list = new Object[oqqpChargesIn.length];
        for (int i = 0; i < oqqpChargesIn.length; i++) {
          list[i] = ChargeElementObjectHelper.getMap(oqqpChargesIn[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "OqqpBillInvoiceOut");
        }
        addInput("OqqpChargesInList", list);
      }
    }
    if (asOfDate != null) {
      addInput("AsOfDate", asOfDate);
    }
    if (accountNo != null) {
      addInput("AccountNo", accountNo);
    }
    if (invoiceCount != null) {
      addInput("InvoiceCount", invoiceCount);
    }
  }


/**
 *
 * Sets the OqqpChargesIn
 * @param oqqpChargesInIn Value of the oqqpChargesIn
 *
 */

  public void setOqqpChargesIn(ChargeElementObjectData[] oqqpChargesInIn) {
    oqqpChargesIn = oqqpChargesInIn;
  }

/**
 *
 * Sets the AsOfDate
 * @param asOfDateIn Value of the asOfDate
 *
 */

  public void setAsOfDate(Date asOfDateIn) {
    asOfDate = asOfDateIn;
  }

/**
 *
 * Sets the AccountNo
 * @param accountNoIn Value of the accountNo
 *
 */

  public void setAccountNo(Integer accountNoIn) {
    accountNo = accountNoIn;
  }

/**
 *
 * Sets the InvoiceCount
 * @param invoiceCountIn Value of the invoiceCount
 *
 */

  public void setInvoiceCount(Integer invoiceCountIn) {
    invoiceCount = invoiceCountIn;
  }

  public void translateFromMap() {
    Object[] list = (Object[]) inputMap.get("OqqpChargesInList");
    if (list != null) {
      oqqpChargesIn = new ChargeElementObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        oqqpChargesIn[i] = ChargeElementObjectHelper.getObj((Map) list[i]);
        oqqpChargesIn[i].resetFlags(true, true);
      }
    }
    asOfDate = (Date)inputMap.get("AsOfDate");
    accountNo = (Integer)inputMap.get("AccountNo");
    invoiceCount = (Integer)inputMap.get("InvoiceCount");
  }

/**
 *
 * Gets the OqqpChargesIn
 * @return Value of the OqqpChargesIn
 *
 */

  public ChargeElementObjectData[] getOqqpChargesIn( ) {
    return oqqpChargesIn;
  }

/**
 *
 * Gets the AsOfDate
 * @return Value of the AsOfDate
 *
 */

  public Date getAsOfDate( ) {
    return asOfDate;
  }

/**
 *
 * Gets the AccountNo
 * @return Value of the AccountNo
 *
 */

  public Integer getAccountNo( ) {
    return accountNo;
  }

/**
 *
 * Gets the InvoiceCount
 * @return Value of the InvoiceCount
 *
 */

  public Integer getInvoiceCount( ) {
    return invoiceCount;
  }

}
