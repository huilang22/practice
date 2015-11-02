/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitChannelFindBulkUdtTemplateItem.java
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
import com.csgsystems.cit.data.*;

/**
 *
 * Class used to create a CitChannelFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CitChannelFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitChannelObjectFilter citChannelFindIn;
/**
 *
 * Constructor to create a  CitChannelFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitChannelFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CitChannelObjectFilter citChannelFindInIn) {
    super(id, context, "CitChannelFind");
    citChannelFindIn = citChannelFindInIn;
  }

  public void translateToMap() {
    if (citChannelFindIn != null) {
      Integer index =  citChannelFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CitChannel", CitChannelObjectHelper.toMap(citChannelFindIn, new HashMap(), "CitChannel").get("CitChannel"));
    }
  }


/**
 *
 * Sets the CitChannel
 * @param citChannelFindInIn Value of the citChannelFindIn
 *
 */

  public void setCitChannel(CitChannelObjectFilter citChannelFindInIn) {
    citChannelFindIn = citChannelFindInIn;
  }

  public void translateFromMap() {
    citChannelFindIn = CitChannelObjectHelper.fromMapFilter(inputMap, "CitChannel");
  }

/**
 *
 * Gets the CitChannel
 * @return Value of the CitChannel
 *
 */

  public CitChannelObjectFilter getCitChannel( ) {
    return citChannelFindIn;
  }

}
