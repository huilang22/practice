/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationDetailAssocGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsLocationDetailAssocGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsLocationDetailAssocGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsLocationTablesObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsLocationDetailAssocGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsLocationDetailAssocGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationTablesObjectData noOpInIn) {
    super(id, context, "InvsLocationDetailAssocGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsLocationDetailAssoc", InvsLocationTablesObjectHelper.toMap(noOpIn, new HashMap(), "InvsLocationDetailAssoc").get("InvsLocationDetailAssoc"));
    }
  }
/**
 *
 * Sets the  InvsLocationDetailAssoc
 * @param noOpInIn InvsLocationTablesObjectData to set
 *
 */
  public void setInvsLocationDetailAssoc(InvsLocationTablesObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsLocationDetailAssoc passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationTablesObjectData getInvsLocationDetailAssoc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsLocationTablesObjectHelper.fromMap(inputMap, "InvsLocationDetailAssoc");
  }
}
