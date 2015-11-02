/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerUdtRequestBean.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest.session;

import com.csgsystems.udt.UdtRootRequest;
import com.csgsystems.udt.xlate.hashmap.*;
import com.comverse.udt.udtrequest.*;
import com.comverse.udt.udtrequest.interfaces.*;
import com.csgsystems.aruba.connection.*;
import com.csgsystems.bali.connection.ApiMappings;
import com.csgsystems.api.utilities.Logger;
import terrapin.tuxedo.TuxError;
import javax.ejb.*;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.inject.Inject;
import java.util.*;

/**
 * @ejb.bean name="CustomerUdtRequestBean"
 * display-name="CustomerUdtRequestStateless Session EJB"
 * type="Stateless"
 * jndi-name="ejb/CustomerUdtRequestBean"
 * transaction-type="Bean"
 * @ejb.permission rolename="ArubaUser"
 * @ejb.security-identity run-as="ArubaUser"
 * @ejb:transaction type="NotSupported"
 */
@Stateless(name="CustomerUdtRequestBean", mappedName="CustomerUdtRequest")
@TransactionManagement(TransactionManagementType.BEAN)
@Path("CustomerUdtRequest")
public final class CustomerUdtRequestBean implements CustomerUdtRequestInterface{
  protected SessionContext sc = null;
  @Inject protected BSDMSettings settings = null;
  protected HashMapUdtTranslator xlator = new HashMapUdtTranslator();

/* Constructor */
  @Inject public CustomerUdtRequestBean (BSDMSettings sett) {
    this.settings = sett;
  }
  /**
   Processes Udt requests for the CustomerUdtRequest server
   @param context Session context for request
   @param request request to be processed
   @return results for request
   @throws BSDMResourceException if the request could not be processed
   */

  public UdtRootRequest process(BSDMSessionContext context, UdtRootRequest request) throws BSDMResourceException {
    if (!(request instanceof CustomerUdtRequest)) {
      throw new BSDMResourceException(BSDMResourceException.FRONT_END, "Request was not of type CustomerUdtRequest");
    }
    return this.process(context, (CustomerUdtRequest)request);
  }
  /**
   Processes Udt requests for the CustomerUdtRequest server
   @param context Session context for request
   @param request request to be processed
   @return results for request
   @throws BSDMResourceException if the request could not be processed
   */

  @Path("")
  @POST
  @Consumes({"application/json", "application/xml"})
  @Produces({"application/json", "application/xml"})
  public CustomerUdtRequest process(@HeaderParam ("context")BSDMSessionContext context, CustomerUdtRequest request) throws BSDMResourceException {
    Connection connection = null;
    BSDMResourceException cex = null;
    try {
      connection = openConnection();
      HashMapOutput output = (HashMapOutput)xlator.translate(request);
      if (Logger.DEBUG) output.debug(System.err);
      HashMap map = connection.call(context, ApiMappings.getCallName("CustomerUdtRequest"), output.getHashMap());
      HashMapInput input = new HashMapInput();
      input.setHashMap(map);
      if (Logger.DEBUG) input.debug(System.err);
      return (CustomerUdtRequest)xlator.translate(input, request);
    } catch (Exception e) {
      cex = new BSDMResourceException (BSDMResourceException.FRONT_END, e);
      throw cex;
    } finally {
      try {
        closeConnection(connection);
      } catch (Exception x) {
        BSDMResourceException bre = new BSDMResourceException (BSDMResourceException.FRONT_END, x);
        if (cex != null) bre.initCause(cex);
        throw bre;
      }
    }
  }
  /** Method used by EJB App Servers */
  public void setSessionContext(SessionContext con) {
   this.sc = con;
  }
  private Connection openConnection() throws TuxError, ServiceException {
    return ConnectionFactory.instance().createConnection(settings);
  }
  private void closeConnection(Connection connection) throws TuxError {
   if (connection != null) connection.close();
  }
}
