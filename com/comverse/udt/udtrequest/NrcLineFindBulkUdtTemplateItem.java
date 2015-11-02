/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcLineFindBulkUdtTemplateItem.java
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
 * Class used to create a NrcLineFindBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcLineFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcLineObjectFilter nlFindIn;
/**
 *
 * Constructor to create a  NrcLineFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcLineFindBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcLineObjectFilter nlFindInIn) {
    super(id, context, "NrcLineFind");
    nlFindIn = nlFindInIn;
  }

  public void translateToMap() {
    if (nlFindIn != null) {
      Integer index =  nlFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NrcLine", NrcLineObjectHelper.toMap(nlFindIn, new HashMap(), "NrcLine").get("NrcLine"));
    }
  }


/**
 *
 * Sets the NrcLine
 * @param nlFindInIn Value of the nlFindIn
 *
 */

  public void setNrcLine(NrcLineObjectFilter nlFindInIn) {
    nlFindIn = nlFindInIn;
  }

  public void translateFromMap() {
    nlFindIn = NrcLineObjectHelper.fromMapFilter(inputMap, "NrcLine");
  }

/**
 *
 * Gets the NrcLine
 * @return Value of the NrcLine
 *
 */

  public NrcLineObjectFilter getNrcLine( ) {
    return nlFindIn;
  }

}
