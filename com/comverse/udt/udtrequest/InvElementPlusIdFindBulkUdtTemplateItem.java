/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementPlusIdFindBulkUdtTemplateItem.java
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
 * Class used to create a InvElementPlusIdFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementPlusIdFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementPlusObjData InvIdFindIn;
/**
 *
 * Constructor to create a  InvElementPlusIdFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementPlusIdFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementPlusObjData InvIdFindInIn) {
    super(id, context, "InvElementPlusIdFind");
    InvIdFindIn = InvIdFindInIn;
  }

  public void translateToMap() {
    if (InvIdFindIn != null) {
      InvIdFindIn.resetFlags(true, true);
      addInput("InvElementPlus", InvElementPlusObjHelper.toMap(InvIdFindIn, new HashMap(), "InvElementPlus").get("InvElementPlus"));
    }
  }


/**
 *
 * Sets the InvElementPlus
 * @param InvIdFindInIn Value of the InvIdFindIn
 *
 */

  public void setInvElementPlus(InvElementPlusObjData InvIdFindInIn) {
    InvIdFindIn = InvIdFindInIn;
  }

  public void translateFromMap() {
    InvIdFindIn = InvElementPlusObjHelper.fromMap(inputMap, "InvElementPlus");
  }

/**
 *
 * Gets the InvElementPlus
 * @return Value of the InvElementPlus
 *
 */

  public InvElementPlusObjData getInvElementPlus( ) {
    return InvIdFindIn;
  }

}
