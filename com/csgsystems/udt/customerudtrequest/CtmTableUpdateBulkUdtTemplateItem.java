/*
 * Generated code DO NOT EDIT
 * Generated file: CtmTableUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a CtmTableUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtmTableUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtmTableObjectData CtmTableUpdateIn;
/**
 *
 * Constructor to create a  CtmTableUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtmTableUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmTableObjectData CtmTableUpdateInIn) {
    super(id, context, "CtmTableUpdate");
    CtmTableUpdateIn = CtmTableUpdateInIn;
  }

  public void translateToMap() {
    if (CtmTableUpdateIn != null) {
      CtmTableUpdateIn.resetFlags(true, true);
      addInput("CtmTable", CtmTableObjectHelper.toMap(CtmTableUpdateIn, new HashMap(), "CtmTable").get("CtmTable"));
    }
  }


/**
 *
 * Sets the CtmTable
 * @param CtmTableUpdateInIn Value of the CtmTableUpdateIn
 *
 */

  public void setCtmTable(CtmTableObjectData CtmTableUpdateInIn) {
    CtmTableUpdateIn = CtmTableUpdateInIn;
  }

  public void translateFromMap() {
    CtmTableUpdateIn = CtmTableObjectHelper.fromMap(inputMap, "CtmTable");
  }

/**
 *
 * Gets the CtmTable
 * @return Value of the CtmTable
 *
 */

  public CtmTableObjectData getCtmTable( ) {
    return CtmTableUpdateIn;
  }

}
