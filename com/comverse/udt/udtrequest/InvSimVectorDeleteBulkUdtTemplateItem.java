/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSimVectorDeleteBulkUdtTemplateItem.java
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
 * Class used to create a InvSimVectorDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class InvSimVectorDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvSimVectorBaseData InvDeleteInData;
/**
 *
 * Constructor to create a  InvSimVectorDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvSimVectorDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, InvSimVectorBaseData InvDeleteInDataIn) {
    super(id, context, "InvSimVectorDelete");
    InvDeleteInData = InvDeleteInDataIn;
  }

  public void translateToMap() {
    if (InvDeleteInData != null) {
      InvDeleteInData.resetFlags(true, true);
      addInput("InvSimVector", InvSimVectorBaseHelper.toMap(InvDeleteInData, new HashMap(), "InvSimVector").get("InvSimVector"));
    }
  }


/**
 *
 * Sets the InvSimVector
 * @param InvDeleteInDataIn Value of the InvDeleteInData
 *
 */

  public void setInvSimVector(InvSimVectorBaseData InvDeleteInDataIn) {
    InvDeleteInData = InvDeleteInDataIn;
  }

  public void translateFromMap() {
    InvDeleteInData = InvSimVectorBaseHelper.fromMap(inputMap, "InvSimVector");
  }

/**
 *
 * Gets the InvSimVector
 * @return Value of the InvSimVector
 *
 */

  public InvSimVectorBaseData getInvSimVector( ) {
    return InvDeleteInData;
  }

}
