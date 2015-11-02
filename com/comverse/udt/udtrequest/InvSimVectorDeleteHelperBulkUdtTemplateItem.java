/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSimVectorDeleteHelperBulkUdtTemplateItem.java
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
 * Class used to create a InvSimVectorDeleteHelperBulkUdtTemplateItem Bulk Template
 *
 */

public class InvSimVectorDeleteHelperBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvSimVectorBaseData InvDelInData;
/**
 *
 * Constructor to create a  InvSimVectorDeleteHelperBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvSimVectorDeleteHelperBulkUdtTemplateItem(String id, BSDMSessionContext context, InvSimVectorBaseData InvDelInDataIn) {
    super(id, context, "InvSimVectorDeleteHelper");
    InvDelInData = InvDelInDataIn;
  }

  public void translateToMap() {
    if (InvDelInData != null) {
      InvDelInData.resetFlags(true, true);
      addInput("InvSimVector", InvSimVectorBaseHelper.toMap(InvDelInData, new HashMap(), "ReturnCode").get("ReturnCode"));
    }
  }


/**
 *
 * Sets the InvSimVector
 * @param InvDelInDataIn Value of the InvDelInData
 *
 */

  public void setInvSimVector(InvSimVectorBaseData InvDelInDataIn) {
    InvDelInData = InvDelInDataIn;
  }

  public void translateFromMap() {
    InvDelInData = InvSimVectorBaseHelper.fromMap(inputMap, "InvSimVector");
  }

/**
 *
 * Gets the InvSimVector
 * @return Value of the InvSimVector
 *
 */

  public InvSimVectorBaseData getInvSimVector( ) {
    return InvDelInData;
  }

}
