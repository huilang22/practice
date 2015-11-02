/*
 * Generated code DO NOT EDIT
 * Generated file: BillExternalIdFindBulkUdtTemplateItem.java
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
 * Class used to create a BillExternalIdFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BillExternalIdFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillExternalIdObjectFilter findIn;
/**
 *
 * Constructor to create a  BillExternalIdFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillExternalIdFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BillExternalIdObjectFilter findInIn) {
    super(id, context, "BillExternalIdFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillExternalId", BillExternalIdObjectHelper.toMap(findIn, new HashMap(), "BillExternalId").get("BillExternalId"));
    }
  }


/**
 *
 * Sets the BillExternalId
 * @param findInIn Value of the findIn
 *
 */

  public void setBillExternalId(BillExternalIdObjectFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = BillExternalIdObjectHelper.fromMapFilter(inputMap, "BillExternalId");
  }

/**
 *
 * Gets the BillExternalId
 * @return Value of the BillExternalId
 *
 */

  public BillExternalIdObjectFilter getBillExternalId( ) {
    return findIn;
  }

}
