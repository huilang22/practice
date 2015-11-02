/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementAutoBulkUdtTemplateItem.java
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
 * Class used to create a InvElementAutoBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementAutoBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjFilter InvAutoIn;
/**
 *
 * Constructor to create a  InvElementAutoBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementAutoBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjFilter InvAutoInIn) {
    super(id, context, "InvElementAuto");
    InvAutoIn = InvAutoInIn;
  }

  public void translateToMap() {
    if (InvAutoIn != null) {
      Integer index =  InvAutoIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvElement", InvElementObjHelper.toMap(InvAutoIn, new HashMap(), "InvElement").get("InvElement"));
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvAutoInIn Value of the InvAutoIn
 *
 */

  public void setInvElement(InvElementObjFilter InvAutoInIn) {
    InvAutoIn = InvAutoInIn;
  }

  public void translateFromMap() {
    InvAutoIn = InvElementObjHelper.fromMapFilter(inputMap, "InvElement");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjFilter getInvElement( ) {
    return InvAutoIn;
  }

}
