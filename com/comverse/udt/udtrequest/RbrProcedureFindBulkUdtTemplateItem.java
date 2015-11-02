/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrProcedureFindBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a RbrProcedureFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrProcedureFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrProcObjectFilter RbrProcFindIn;
/**
 *
 * Constructor to create a  RbrProcedureFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrProcedureFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrProcObjectFilter RbrProcFindInIn) {
    super(id, context, "RbrProcedureFind");
    RbrProcFindIn = RbrProcFindInIn;
  }

  public void translateToMap() {
    if (RbrProcFindIn != null) {
      Integer index =  RbrProcFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RbrProcedure", RbrProcObjectHelper.toMap(RbrProcFindIn, new HashMap(), "RbrProcedure").get("RbrProcedure"));
    }
  }


/**
 *
 * Sets the RbrProcedure
 * @param RbrProcFindInIn Value of the RbrProcFindIn
 *
 */

  public void setRbrProcedure(RbrProcObjectFilter RbrProcFindInIn) {
    RbrProcFindIn = RbrProcFindInIn;
  }

  public void translateFromMap() {
    RbrProcFindIn = RbrProcObjectHelper.fromMapFilter(inputMap, "RbrProcedure");
  }

/**
 *
 * Gets the RbrProcedure
 * @return Value of the RbrProcedure
 *
 */

  public RbrProcObjectFilter getRbrProcedure( ) {
    return RbrProcFindIn;
  }

}
