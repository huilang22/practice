/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentTransferBulkUdtTemplateItem.java
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

/**
 *
 * Class used to create a PaymentTransferBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentTransferBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentObjectKeyData payXferIn;
  protected String account_external_id;
  protected Integer account_external_id_type;
  protected Integer bill_ref_no;
  protected Integer bill_ref_resets;
  protected Integer open_item_id;
/**
 *
 * Constructor to create a  PaymentTransferBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentTransferBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentObjectKeyData payXferInIn, String account_external_idIn, Integer account_external_id_typeIn, Integer bill_ref_noIn, Integer bill_ref_resetsIn, Integer open_item_idIn) {
    super(id, context, "PaymentTransfer");
    payXferIn = payXferInIn;
    account_external_id = account_external_idIn;
    account_external_id_type = account_external_id_typeIn;
    bill_ref_no = bill_ref_noIn;
    bill_ref_resets = bill_ref_resetsIn;
    open_item_id = open_item_idIn;
  }

  public void translateToMap() {
    if (payXferIn != null) {
      payXferIn.resetFlags(true, true);
      addInput("Payment", PaymentObjectKeyHelper.toMap(payXferIn, new HashMap(), "PaymentObjectKeyData").get("PaymentObjectKeyData"));
    }
    if (account_external_id != null) {
      addInput("AccountExternalId", account_external_id);
    }
    if (account_external_id_type != null) {
      addInput("AccountExternalIdType", account_external_id_type);
    }
    if (bill_ref_no != null) {
      addInput("BillRefNo", bill_ref_no);
    }
    if (bill_ref_resets != null) {
      addInput("BillRefResets", bill_ref_resets);
    }
    if (open_item_id != null) {
      addInput("OpenItemId", open_item_id);
    }
  }


/**
 *
 * Sets the Payment
 * @param payXferInIn Value of the payXferIn
 *
 */

  public void setPayment(PaymentObjectKeyData payXferInIn) {
    payXferIn = payXferInIn;
  }

/**
 *
 * Sets the AccountExternalId
 * @param account_external_idIn Value of the account_external_id
 *
 */

  public void setAccountExternalId(String account_external_idIn) {
    account_external_id = account_external_idIn;
  }

/**
 *
 * Sets the AccountExternalIdType
 * @param account_external_id_typeIn Value of the account_external_id_type
 *
 */

  public void setAccountExternalIdType(Integer account_external_id_typeIn) {
    account_external_id_type = account_external_id_typeIn;
  }

/**
 *
 * Sets the BillRefNo
 * @param bill_ref_noIn Value of the bill_ref_no
 *
 */

  public void setBillRefNo(Integer bill_ref_noIn) {
    bill_ref_no = bill_ref_noIn;
  }

/**
 *
 * Sets the BillRefResets
 * @param bill_ref_resetsIn Value of the bill_ref_resets
 *
 */

  public void setBillRefResets(Integer bill_ref_resetsIn) {
    bill_ref_resets = bill_ref_resetsIn;
  }

/**
 *
 * Sets the OpenItemId
 * @param open_item_idIn Value of the open_item_id
 *
 */

  public void setOpenItemId(Integer open_item_idIn) {
    open_item_id = open_item_idIn;
  }

  public void translateFromMap() {
    payXferIn = PaymentObjectKeyHelper.fromMap(inputMap, "Payment");
    account_external_id = (String)inputMap.get("AccountExternalId");
    account_external_id_type = (Integer)inputMap.get("AccountExternalIdType");
    bill_ref_no = (Integer)inputMap.get("BillRefNo");
    bill_ref_resets = (Integer)inputMap.get("BillRefResets");
    open_item_id = (Integer)inputMap.get("OpenItemId");
  }

/**
 *
 * Gets the Payment
 * @return Value of the Payment
 *
 */

  public PaymentObjectKeyData getPayment( ) {
    return payXferIn;
  }

/**
 *
 * Gets the AccountExternalId
 * @return Value of the AccountExternalId
 *
 */

  public String getAccountExternalId( ) {
    return account_external_id;
  }

/**
 *
 * Gets the AccountExternalIdType
 * @return Value of the AccountExternalIdType
 *
 */

  public Integer getAccountExternalIdType( ) {
    return account_external_id_type;
  }

/**
 *
 * Gets the BillRefNo
 * @return Value of the BillRefNo
 *
 */

  public Integer getBillRefNo( ) {
    return bill_ref_no;
  }

/**
 *
 * Gets the BillRefResets
 * @return Value of the BillRefResets
 *
 */

  public Integer getBillRefResets( ) {
    return bill_ref_resets;
  }

/**
 *
 * Gets the OpenItemId
 * @return Value of the OpenItemId
 *
 */

  public Integer getOpenItemId( ) {
    return open_item_id;
  }

}
