""" -*- python -*-
    $Id: ArubaErrors.py,v 1.1 2002/12/09 17:30:02 wcox Exp $

"""

ArubaConnectionError = "ArubaConnection.ArubaConnectionError"

class RemoteError (Exception):
    """Error occurring during call setup or connection."""
    pass

