/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimResellerFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsSimResellerFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimResellerFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimResellerObjectFilter InvsSimResellerFindIn;
/**
 *
 * Constructor to create a  InvsSimResellerFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimResellerFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimResellerObjectFilter InvsSimResellerFindInIn) {
    super(id, context, "InvsSimResellerFind");
    InvsSimResellerFindIn = InvsSimResellerFindInIn;
  }

  public void translateToMap() {
    if (InvsSimResellerFindIn != null) {
      Integer index =  InvsSimResellerFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsSimReseller", InvsSimResellerObjectHelper.toMap(InvsSimResellerFindIn, new HashMap(), "InvsSimReseller").get("InvsSimReseller"));
    }
  }


/**
 *
 * Sets the InvsSimReseller
 * @param InvsSimResellerFindInIn Value of the InvsSimResellerFindIn
 *
 */

  public void setInvsSimReseller(InvsSimResellerObjectFilter InvsSimResellerFindInIn) {
    InvsSimResellerFindIn = InvsSimResellerFindInIn;
  }

  public void translateFromMap() {
    InvsSimResellerFindIn = InvsSimResellerObjectHelper.fromMapFilter(inputMap, "InvsSimReseller");
  }

/**
 *
 * Gets the InvsSimReseller
 * @return Value of the InvsSimReseller
 *
 */

  public InvsSimResellerObjectFilter getInvsSimReseller( ) {
    return InvsSimResellerFindIn;
  }

}
