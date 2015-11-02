/*
 * Generated code DO NOT EDIT
 * Generated file: BillExternalIdGetBulkUdtTemplateItem.java
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
import com.csgsystems.si.data.*;

/**
 *
 * Class used to create a BillExternalIdGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BillExternalIdGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillExternalIdObjectKeyData getIn;
/**
 *
 * Constructor to create a  BillExternalIdGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillExternalIdGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BillExternalIdObjectKeyData getInIn) {
    super(id, context, "BillExternalIdGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("BillExternalId", BillExternalIdObjectKeyHelper.toMap(getIn, new HashMap(), "BillExternalIdObjectKeyData").get("BillExternalIdObjectKeyData"));
    }
  }


/**
 *
 * Sets the BillExternalId
 * @param getInIn Value of the getIn
 *
 */

  public void setBillExternalId(BillExternalIdObjectKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = BillExternalIdObjectKeyHelper.fromMap(inputMap, "BillExternalId");
  }

/**
 *
 * Gets the BillExternalId
 * @return Value of the BillExternalId
 *
 */

  public BillExternalIdObjectKeyData getBillExternalId( ) {
    return getIn;
  }

}
