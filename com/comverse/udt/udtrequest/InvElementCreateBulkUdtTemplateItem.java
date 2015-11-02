/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvElementCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjData InvCreateInData;
/**
 *
 * Constructor to create a  InvElementCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjData InvCreateInDataIn) {
    super(id, context, "InvElementCreate");
    InvCreateInData = InvCreateInDataIn;
  }

  public void translateToMap() {
    if (InvCreateInData != null) {
      InvCreateInData.resetFlags(true, true);
      addInput("InvElement", InvElementObjHelper.toMap(InvCreateInData, new HashMap(), "InvElement").get("InvElement"));
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvCreateInDataIn Value of the InvCreateInData
 *
 */

  public void setInvElement(InvElementObjData InvCreateInDataIn) {
    InvCreateInData = InvCreateInDataIn;
  }

  public void translateFromMap() {
    InvCreateInData = InvElementObjHelper.fromMap(inputMap, "InvElement");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjData getInvElement( ) {
    return InvCreateInData;
  }

}
