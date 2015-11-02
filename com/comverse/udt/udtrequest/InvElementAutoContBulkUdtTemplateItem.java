/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementAutoContBulkUdtTemplateItem.java
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
 * Class used to create a InvElementAutoContBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementAutoContBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjFilter InvAutoContIn;
/**
 *
 * Constructor to create a  InvElementAutoContBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementAutoContBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjFilter InvAutoContInIn) {
    super(id, context, "InvElementAutoCont");
    InvAutoContIn = InvAutoContInIn;
  }

  public void translateToMap() {
    if (InvAutoContIn != null) {
      Integer index =  InvAutoContIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvElement", InvElementObjHelper.toMap(InvAutoContIn, new HashMap(), "InvElement").get("InvElement"));
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvAutoContInIn Value of the InvAutoContIn
 *
 */

  public void setInvElement(InvElementObjFilter InvAutoContInIn) {
    InvAutoContIn = InvAutoContInIn;
  }

  public void translateFromMap() {
    InvAutoContIn = InvElementObjHelper.fromMapFilter(inputMap, "InvElement");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjFilter getInvElement( ) {
    return InvAutoContIn;
  }

}
