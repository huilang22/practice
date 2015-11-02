/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTypeEligibleFindBulkUdtTemplateItem.java
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
 * Class used to create a AdjustmentTypeEligibleFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjustmentTypeEligibleFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnbilledUsageObjectData unbilled_usage;
  protected BilledUsageObjectData billed_usage;
  protected InvoiceDetailObjectData invoice_detail;
  protected BalanceLineItemObjectData balance_line_item;
  protected InvoiceObjectData invoice;
  protected Integer language_code;
  protected Integer trans_sign;
/**
 *
 * Constructor to create a  AdjustmentTypeEligibleFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjustmentTypeEligibleFindBulkUdtTemplateItem(String id, BSDMSessionContext context, UnbilledUsageObjectData unbilled_usageIn, BilledUsageObjectData billed_usageIn, InvoiceDetailObjectData invoice_detailIn, BalanceLineItemObjectData balance_line_itemIn, InvoiceObjectData invoiceIn, Integer language_codeIn, Integer trans_signIn) {
    super(id, context, "AdjustmentTypeEligibleFind");
    unbilled_usage = unbilled_usageIn;
    billed_usage = billed_usageIn;
    invoice_detail = invoice_detailIn;
    balance_line_item = balance_line_itemIn;
    invoice = invoiceIn;
    language_code = language_codeIn;
    trans_sign = trans_signIn;
  }

  public void translateToMap() {
    if (unbilled_usage != null) {
      unbilled_usage.resetFlags(true, true);
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(unbilled_usage, new HashMap(), "AdjustmentType").get("AdjustmentType"));
    }
    if (billed_usage != null) {
      billed_usage.resetFlags(true, true);
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(billed_usage, new HashMap(), "AdjustmentType").get("AdjustmentType"));
    }
    if (invoice_detail != null) {
      invoice_detail.resetFlags(true, true);
      addInput("InvoiceDetail", InvoiceDetailObjectHelper.toMap(invoice_detail, new HashMap(), "AdjustmentType").get("AdjustmentType"));
    }
    if (balance_line_item != null) {
      balance_line_item.resetFlags(true, true);
      addInput("BalanceLineItem", BalanceLineItemObjectHelper.toMap(balance_line_item, new HashMap(), "AdjustmentType").get("AdjustmentType"));
    }
    if (invoice != null) {
      invoice.resetFlags(true, true);
      addInput("Invoice", InvoiceObjectHelper.toMap(invoice, new HashMap(), "AdjustmentType").get("AdjustmentType"));
    }
    if (language_code != null) {
      addInput("LanguageCode", language_code);
    }
    if (trans_sign != null) {
      addInput("TransSign", trans_sign);
    }
  }


/**
 *
 * Sets the UnbilledUsage
 * @param unbilled_usageIn Value of the unbilled_usage
 *
 */

  public void setUnbilledUsage(UnbilledUsageObjectData unbilled_usageIn) {
    unbilled_usage = unbilled_usageIn;
  }

/**
 *
 * Sets the BilledUsage
 * @param billed_usageIn Value of the billed_usage
 *
 */

  public void setBilledUsage(BilledUsageObjectData billed_usageIn) {
    billed_usage = billed_usageIn;
  }

/**
 *
 * Sets the InvoiceDetail
 * @param invoice_detailIn Value of the invoice_detail
 *
 */

  public void setInvoiceDetail(InvoiceDetailObjectData invoice_detailIn) {
    invoice_detail = invoice_detailIn;
  }

/**
 *
 * Sets the BalanceLineItem
 * @param balance_line_itemIn Value of the balance_line_item
 *
 */

  public void setBalanceLineItem(BalanceLineItemObjectData balance_line_itemIn) {
    balance_line_item = balance_line_itemIn;
  }

/**
 *
 * Sets the Invoice
 * @param invoiceIn Value of the invoice
 *
 */

  public void setInvoice(InvoiceObjectData invoiceIn) {
    invoice = invoiceIn;
  }

/**
 *
 * Sets the LanguageCode
 * @param language_codeIn Value of the language_code
 *
 */

  public void setLanguageCode(Integer language_codeIn) {
    language_code = language_codeIn;
  }

/**
 *
 * Sets the TransSign
 * @param trans_signIn Value of the trans_sign
 *
 */

  public void setTransSign(Integer trans_signIn) {
    trans_sign = trans_signIn;
  }

  public void translateFromMap() {
    unbilled_usage = UnbilledUsageObjectHelper.fromMap(inputMap, "UnbilledUsage");
    billed_usage = BilledUsageObjectHelper.fromMap(inputMap, "BilledUsage");
    invoice_detail = InvoiceDetailObjectHelper.fromMap(inputMap, "InvoiceDetail");
    balance_line_item = BalanceLineItemObjectHelper.fromMap(inputMap, "BalanceLineItem");
    invoice = InvoiceObjectHelper.fromMap(inputMap, "Invoice");
    language_code = (Integer)inputMap.get("LanguageCode");
    trans_sign = (Integer)inputMap.get("TransSign");
  }

/**
 *
 * Gets the UnbilledUsage
 * @return Value of the UnbilledUsage
 *
 */

  public UnbilledUsageObjectData getUnbilledUsage( ) {
    return unbilled_usage;
  }

/**
 *
 * Gets the BilledUsage
 * @return Value of the BilledUsage
 *
 */

  public BilledUsageObjectData getBilledUsage( ) {
    return billed_usage;
  }

/**
 *
 * Gets the InvoiceDetail
 * @return Value of the InvoiceDetail
 *
 */

  public InvoiceDetailObjectData getInvoiceDetail( ) {
    return invoice_detail;
  }

/**
 *
 * Gets the BalanceLineItem
 * @return Value of the BalanceLineItem
 *
 */

  public BalanceLineItemObjectData getBalanceLineItem( ) {
    return balance_line_item;
  }

/**
 *
 * Gets the Invoice
 * @return Value of the Invoice
 *
 */

  public InvoiceObjectData getInvoice( ) {
    return invoice;
  }

/**
 *
 * Gets the LanguageCode
 * @return Value of the LanguageCode
 *
 */

  public Integer getLanguageCode( ) {
    return language_code;
  }

/**
 *
 * Gets the TransSign
 * @return Value of the TransSign
 *
 */

  public Integer getTransSign( ) {
    return trans_sign;
  }

}
