/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderSuspendCreateBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ServiceOrderSuspendCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderSuspendCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderObjectBaseData SuspServiceOrderCreateIn;
  protected Date ResumeDate;
/**
 *
 * Constructor to create a  ServiceOrderSuspendCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderSuspendCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderObjectBaseData SuspServiceOrderCreateInIn, Date ResumeDateIn) {
    super(id, context, "ServiceOrderSuspendCreate");
    SuspServiceOrderCreateIn = SuspServiceOrderCreateInIn;
    ResumeDate = ResumeDateIn;
  }

  public void translateToMap() {
    if (SuspServiceOrderCreateIn != null) {
      SuspServiceOrderCreateIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(SuspServiceOrderCreateIn, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
    if (ResumeDate != null) {
      addInput("ResumeDate", ResumeDate);
    }
  }


/**
 *
 * Sets the ServiceOrder
 * @param SuspServiceOrderCreateInIn Value of the SuspServiceOrderCreateIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectBaseData SuspServiceOrderCreateInIn) {
    SuspServiceOrderCreateIn = SuspServiceOrderCreateInIn;
  }

/**
 *
 * Sets the ResumeDate
 * @param ResumeDateIn Value of the ResumeDate
 *
 */

  public void setResumeDate(Date ResumeDateIn) {
    ResumeDate = ResumeDateIn;
  }

  public void translateFromMap() {
    SuspServiceOrderCreateIn = ServiceOrderObjectBaseHelper.fromMap(inputMap, "ServiceOrder");
    ResumeDate = (Date)inputMap.get("ResumeDate");
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectBaseData getServiceOrder( ) {
    return SuspServiceOrderCreateIn;
  }

/**
 *
 * Gets the ResumeDate
 * @return Value of the ResumeDate
 *
 */

  public Date getResumeDate( ) {
    return ResumeDate;
  }

}
