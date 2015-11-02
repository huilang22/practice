/*
 * Generated code DO NOT EDIT
 * Generated file: OpenItemDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OpenItemDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OpenItemDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OpenItemObjectData noOpIn;

/**
 *
 * Constructor to create a   OpenItemDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OpenItemDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OpenItemObjectData noOpInIn) {
    super(id, context, "OpenItemDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OpenItem", OpenItemObjectHelper.toMap(noOpIn, new HashMap(), "OpenItem").get("OpenItem"));
    }
  }
/**
 *
 * Sets the  OpenItem
 * @param noOpInIn OpenItemObjectData to set
 *
 */
  public void setOpenItem(OpenItemObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OpenItem passed into the constructor
 * @return Simulated response
 *
 */
  public OpenItemObjectData getOpenItem() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OpenItemObjectHelper.fromMap(inputMap, "OpenItem");
  }
}
